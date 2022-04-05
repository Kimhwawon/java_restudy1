package day6;

//인터페이스는 왜 필요한가?
//다음은 어떤 동물원 사육사가 하는 일이다. 
//난 동물원의 사육사이다.
//육식동물이 들어오면 난 먹이를 던져준다.
//호랑이가 오면 사과를 던져준다.
//사자가 오면 바나나를 던져준다.
//이런 케이스를 코드로 담아보자. 다음과 같이  Animal,Tiger,Lion,Zookeeper 클래스를 작성하자.


//인터페이스 작성하기
//다음과 같이 코드 상단에 육식동물(Predator)인터페이스를 추가하자.
interface Predator{	
	// 이번에도 인터페이스의 마법을 부려보자.
	// predator 인터페이스에 다음과 같은 메소드를 추가 해보자. 
	String getFood();
	// 디폴트 메서드
	// 자바8버전 이후부터는 디폴트 메서드를 사용할 수 있다. 
	// 인터페이스의 메서드는 몸통(구현체)을 가질수 없지만 디폴트 메서드를 사용하면 실제 수혀된 형태의 메서드를 가질 수 있다.
	// 예를 들어 Predator 인터페이스에 다음과 같은 디폴트 메서드를 추가할 수 있다. 
	
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
		// 디폴트 메서드는 메소드명 가장 앞에"default"라고 표기해야 한다.
		// 이렇게 Predator 인터페이스에 
		// printFood 디폴트 메서드를 구현하면 Predator 인터페이스를 구현한 Tiger,Lion등의 실제 클래스는
		// printFood 메서드를 구현하지 않아도 사용할 수 있다. 그리고 디폴트 메서드는 오버라이딩이 가능하다. 즉.
		// printFood 메서드를 실제 클래스에서 다르게 구현하여 사용할수 있다. 
	}
	// 스태틱 메서드
	// 자바8버전 이후부터는 인터페이스에 스태틱 메서드를 사용할 수 있다.
	// 인터페이스에 스태틱 메서드를 구현하면 인터페이스명.스태틱메서드명 과 같이 사용하여 일반 클래스의 스태틱 메서드를 사용
	// 하는 것과 동일하게 사용할 수 있다.
	// 예를 들어 Predator 인터페이스에 다음과 같은 스태틱 메서드를 추가 할 수 있다. 
	int LEG_COUNT = 4; //인터페이스 상수
	
	static int speed() {
		return LEG_COUNT * 30;
		// 이렇게 스태틱 메서드를 추가하면 다음과 같이 사용할 수 있따.
		// Predator.speed();
		인터페이스 상수

		// 위 코드에서 사용한 int LEG_COUNT = 4; 문장은 인터페이스에 정의한 상수이다. 
		// 인터페이스에 정의한 상수는 int LEG_COUNT=4; 처럼 public static final을 생략해도 
		// 자동으로 public static final이 적용된다. 
		// (다른 형태의 상수 정의는 불가능하다.)
	}
}
class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}
//위 코드와 같이 인터페이스는 class가 아닌 interface라는 키워드를 이용하여 작성한다. 
//인터페이스는 클래스와 마찬가지로  Predator.java와 같은 단독 파일로 저장하는 것이 일반적인 방법이다
//그리고 Tiger,Lion 클래스는 작성한 인터페이스를 구현하도록 (Implements)수정하자. 
class Tiger extends Animal implements Predator{
	// getFood라는 메소드를 추가했다.
	// 그런데 좀 이상하다.
	// 메소드에 몸통이 없다?
	// 인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다.
	// 그 이유는 인터페이스는 규칙이기 때문이다. 
	// 위에서 설정한 getFood라는 메소드는 인터페이스를 implements한 클래스들이
	// 구현해야만 하는 것이다.
	// 인터페이스에 위처럼 메소드를 추가하면 Tiger,Lion등이 Predator 인터페이스를 구현한 클래스들에서 컴파일 오류가 발생할 것이다.
	// 오류를 해결하려면 다음처럼  Tiger,Lion 클래스에 getFood 메소드를 구현해야 한다. 
	public String getFood() {
		return "apple";
	}
	
}
class Lion extends Animal implements Predator{
	public String getFood() {
		return "banana";
	}
	
}
//인터페이스 구현은 위와같이 implements라는 키워드를 사용한다. 
//이렇게 Tiger,Lion 클래스가 Predator인터페이스를 구현하게 되면  ZooKeeper 클래스의 feed메소드를 다음과 같이 변경 할 수 있다. 
// 변경전
class ZooKeeper{
	//void feed(Tiger tiger) { // 호랑이가 오면 사과를 던져 준다. 
	 void feed(Predator predator) {
		// 인터페이스의 메소드
		// 자, 그런데 위 ZooKeeper클래스에 약간의문제가 발생했다.
		// 아래의 ZooKeeper클래스의 feed 메소드를 보면 호랑이가 오던지, 사자가 오던지 무조건 "feed apple" 이라는 문자열을 출력한다. 
		// 사자가 오면 "feed banana"를 출력해야 하지 않겠는가
		//System.out.println("feed apple"); // 항상 feed apple 만을 출력한다. 
		// 이제 ZooKeeper 클래스도 다음과 같이 변경이 가능하다. 
		 System.out.println("feed" + predator.getFood());
		 
		// feed메소드가 "feed apple"을 출력하더 ㄴ곳에서 "feed " +predator.getFood()를 출력하도록 변경되었다.
		// predator.getFood()를 호출하면 Predator 인터페이스를 구현한 구현체(Tiger,Lion)의 getFood()메소드가호출된다.
		// 그리고 프로그램을 실행해 보자. 
		// 원하던 데로 다음과 같은 결과값이 출력되는 것을 확인할 수 있을 것이다. 
		// feed apple
		// feed banana
	}
	// feed 메소드의 입력으로 Tiger,Lion을 각각 필요로 했지만 이제 이것을 Predator라는 인터페이스로 대체할 수 있게 되었다.
	// tiger,lion은 각각 Tiger,Lion의 객체이기도 하지만 Predator인터페이스의 객체이기도 하기 때문에 위와 같이 Predator를 자료형의 타입으로 
	// 사용할 수 있는 것이다.
	// 상속에서 공부했던 IS-A관계가 인터페이스에도 마찬가지로 적용된다.
	// "Tiger is a Predator", "Lion is a Predator"가 성립된다. 
	// tiger - Tiger 클래스의 객체, Predator 인터페이스의 객체
	// lion - Lion 클래스의 객체, Predator 인터페이스의 객체
	
	 // 이제 어떤 육식동물이 추가 되더라도 ZooKeeper는 feed메소드를 추가할 필요가 없다.
	// 다만 육식동물이 추가 될 때마다 다음과 같이 Predator 인터페이스를 구현한 클래스를 작성하기만 하면 되는 것이다. 
	// 눈치가 빠르다면 이제 애 인터페이스가 필요한지 감을 잡았을 것이다. 
	// 보통 중요 클래스를 작성하는 입장이라면(여기서는 ZooKeeper가 중요한 클래스이다)
	// 클래스의 구현체와 상관없이 인터페이스를 기준으로 중요 클래스를 작성해야만 한다.
	// 구현체(Tiger, Lion, Crocodile)는 늘어날수 있지만 인터페이스는 하나이기 때문이다. 


	void feed(Lion Lion) { // 사자가 오면 바나나를 던져 준다. 
		System.out.println("feed banana");
	}
}
public class Sample3 {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger); // feed apple 출력
		zooKeeper.feed(lion);// feed banana 출력
		// 이전 챕터에서 보았던 Dog 클래스와 마찬가지로  Animal을 상속한  Tiger을 상속한 Tiger와 Lion이 등장했다.
		// 그리고 사육사 클래스인 ZooKeeper클래스를 위처럼 정의 하였다. 
		// ZooKeeper클래스는 호랑이가 왔을때, 사자가 왔을때 각각 달른 feed메소드가 호출된다.
		// ZooKeeper클래스의 feed 메소드처럼 입력값의 자료형 타입이 다를 경우 (위에서는  Tiger,Lion으로 서로 다르다)
		// 메소드 명을 동일하게 (여기서는 메소드명이 feed로 동일하다.)사용할 수 있따. 이런것을 메소드 오버로딩 이라고 한다. 
		// 프로그램을 실행하면 다음과 같은 결과가 출력될 것이다. 
		// feed apple
		// feed banana
		// 자 , 이제 다음을 생각 해 보자.
		// 동물원에 호랑이와 사자뿐이라면 ZooKeeper클래스는 더이상 할일이 없겠지만 악어, 표범등이 계속 추가 된다면
		// ZooKeeper는 육식동물이 추가될 때마다 매번 다음과 같은 feed 메소드를 추가해야 한다. 
		
		
		
		
		
		// 인터페이스의 핵심과 개념
		// 이번 장에서 가장 중요한 부분은 왜 인터페이스가 필요한지에 대해서 이해하는 것이다. 
		// 육식 동물들의 종류만큼의 feed메소드가 필요했던 ZooKeeper 클래스를 Predator 인터페이스를 이용하여
		// 구현했더니 단 한개의 feed 메소드로 구현이 가능해졌다. 
		// 여기서 중요한 점은 메소드의 갯수가 줄어들었다는 점이 아니라 ZooKeeper클래스가 동물들의 종류에 의존적인 클래스에서 
		// 동물들의 종류와 상관없는 독립적인 클래스가 되었다는 점이다. 
		// 바로 이 점이 인터페이스의 핵심이다. 
		// 이벙네는 좀 더 개념적으로 인터페이스를 생각해 보자.
		// 아마도 여러분은 컴퓨터의 USB포트에 대해서 알고 있을 것이다. 
		// USB포트가 물리적 세게의 인터페이스라고 할 수 있다. 
		//USB포트의 규격만 알면 어떤 기기도 만들 수 있다.
		// 또 컴퓨터는 USB포트만 제공하고 어떤 기기가 만들어지는 지 신경쓸 필요가 없다 
		// 바로 이 점이 인터페이스와 매무 비슷하다. 위에서 만든 사육사가(ZooKeeper)가 어떤 육식동물(Tiger,Lion)이던지 상관하지 않고
		// 먹이를 주는 것처럼
		// 물리적 세계	자바 세계
		// 컴퓨터	          ZooKeeper
		// USB 포트	Predator
		// 하드디스크,디지털카메라,...  	Tiger, Lion, Crocodile,...

		// 상속과 인터페이스
		// 우에서 작성한 Predator인터페이스 대신  Animal 클래스에 getFood메소드를 추가하고 Tiger,Lion등에서
		// getFood 메소드를 오버라딩 한 후 ZooKeeper의 feed 메소드가 Predator 대신 Animal을 입력 자료형으로 사용해도 동일한
		// 효과를 거둘 수 있다. 
		// 하지만 상속은 자식 클래스가 부모 클래스의 메소드를 오버라딩하지 않고 사용할 수 있기 때문에 해당 메소드를 반드시 구현해야 한다. 
		// "강제성"을 갖지 못한다. 
		// 상황에 맞게 상속을 사용할 것인지 인터페이스를 사용해야 할 지를 결정해야 겠지만 인터페이스는 인터페이스의 메소드를 
		// 반드시 구현해야 하는 "강제성"을 갖는다는 점을 반드시기억

	}

}
