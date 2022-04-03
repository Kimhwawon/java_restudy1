package day5;
//인터페이스
//인터페이스(Interface)는 초보 개발자를 괴롭히는 단골손님이다.
//인터페이스에 대한 개념없이 코드로만 이해하려고 하면 곧 미궁에 빠지게 된다.
//이렇게 힘든 인터페이스는 도대체 왜 필요하게 된 걸까?
//이번장에서는 인터페이스에 대하여 예제를 통해 차근차근 알아보자. 

//인터페이스는 왜 필요한가?
//다음은 어떤 동물원 사육사가 하는 일이다. 
//난 동물원의 사육사이다.
//육식동물이 들어오면 난 먹이를 던져준다.
//호랑이가 오면 사과를 던져준다.
//사자가 오면 바나나를 던져준다.
//이런 케이스를 코드로 담아보자. 다음과 같이  Animal,Tiger,Lion, Zookeeper클래스를 작성하자. 


//인터페이스 작성하기
//다음과 같이 코드 상단에 육식동물(Predator)인터페이스를 추가하자. 

//이번에도 인터페이스의 마법을 부져보자.
//Predator인터페이스에 다음과 같은 메소드를 추가 해 보자. 

interface Predator{
	String gerFood();
	
	// 디폴트 메서드
	// 자바 8버전 이후부터는 디폴트 메서드를 사용할 수 있다.
	// 인터페이스에 매서드는 몸통을 가질 수 없지만
	// 디폴트 메서드를 사용하면 실제 구현된 형태의 메서드를 가질 수 있다.
	// 예를 들어 Predator인터페이스에 다음과 같은 디폴트 메서드를 추가할 수 있다. 
	default void printFood() {
		System.out.printf("my food is %s\n", gerFood());
		// 디폴트 메서드는 메소드명 가장 앞에 "default" 라고 표기해야 한다. 
		// 이렇게 Predator 인터페이스에 printFood 디폴트 메서드를 구현하면 
		// Predator 인터페이스를 구현한 Tiger, Lion 등의 실제 클래스는 printFood 메서드를 구현하지 않아도 사용할 수 있다. 
		// 그리고 디폴트 메스드는 오버라이딩이 가능하다. 
		// 즉, printFood 메서드를 실제 클래스에서 다르게 구현하여 사용할수 있다.
	}
	// 스태틱 메서드
	// 자바8 버전 이후부터는 인터페이스에 스태틱 메서드(static method)를 사용할 수 있다. 
	// 인터페이스에 스태틱 메서드를 구현하면 인터페이스명.스태틱메서드명 과 같이 사용하여 
	// 일반 클래스의 스태틱 메서드를 사용하는 것과 동일하게 사용할 수 있다.
	// 예를들어 Predator 인터페이스에 다음과 같은 스태틱 메서드를 추가할 수 있다.
	int LEG_COUNT = 4; // 인터페이스 상수
	
	static int speed() {
		return LEG_COUNT * 30;
		// 이렇게 스태틱 메서드를 추가하면 다음과 같이 사용할 수 있다.
		// Predator.speed();

	}
}


class Animal{
	String name;
	
	void SetName(String name) {
		this.name = name;
	}
}

//위 코드와 같이 인터페이스는 class가 아닌 interface라는 키워드를 이용하여 작성한다. 
//인터페이시는 클래스와 마찬가지로  Predator.java와 같은 단독 파일로 저장하는 것이 일반적인 방법이다.
//여기서는 설명의 편의를 위해 Sample.java파일의 최상단에서 작성하였다. 
//그리고 Tiger,Lion클래스는 작성한 인터페이스를 구현하도록 (Implements) 수정하자.

//getFeed라는 메소드를 추가 했다.
//그런데 좀 이상하다. 메소드에 몸통이 업다?
//인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고
//그 내용은 없다. 그 이유는 인터페이스는 규칙이기 때문이다
//위의서 설정한 getFeed라는 메소드는 인터페이스를 implements한 클래스들이 구현해야만 하는 것이다.
//인터페이스에 위처럼 메소드를 추가하면 Tiger,Lion클래스에 getFeed메소드를 구현해야 한다. 
class Tiger extends Animal implements Predator{	
	public String getFood() {
		return "apple";
	}

}
class Lion extends Animal implements Predator{ 
	public String getFood() {
		return "banana";
	}
}

//인터페이스 구현은 위와같이  implements라는 키워드를 사용한다.
//이렇게 Tiger,Lion 클래스가 Predator인터페이스를 구현하게 되면  Zookeeper클래스의 feed메소드를 다음과 같이 변경 할 수 있다. 
class ZooKeeper{
	//void feed(Predator prdeator) { //호랑이가 오면 사과를 던저 준다.
		//System.out.println("feed apple");
	// 인터페이스의 메소드
	// 자, 그런데 위 Zookeeper클래스에 약간의 문제가 발생했다.
	// 아래의 ZooKeeper클래스의 feed메소들르 보면 호랑이가 오던지, 사자가 오던지
	// 무조건  "feed apple"이라는 문자열을 출력한다.
	// 사자가 오면 "feed banana"를 출력해야하지 않겠는가
		public void feed(Predator predator) {
			// Tiger, Lion 클래스의 getFood 메소드에 육식동물의 먹이인 "apple", "banana"를 각각 리턴하도록  작성햇따.
			// 이렇게 getFood메소드를 추가하면 컴파일 오류가 해결될 것이다. 
			// 이제  ZooKeeper클래스도 다음과 같이 변경이 가능하다. 
			System.out.println("feed" + predator.getFood());  
			//feed 메소드가 "feed apple"을 출력하던 것에서 "feed" + predator.getFood()를 출력하도록 변경되었다.
			// predator.getFood()를 호출하면 Predator인터페이스를 구현한 구현체(Tiger, Lion)의 getFood()메소드가 호출된다. 

			// 그리고 프로그램을 실행해 보자. 
			// 원하던 데로 다음과 같은 결과값이 출력되는 것을 확인할 수 있을 것이다. 
			// feed apple
			// feed nababa


		}
	//}
	void feed(Lion lion) { //사자가 오면 바나나를 던져 준다.
		System.out.println("feed nababa");
	}
}
//feed메소드의 입력으로 Tiger,Lion을 각각 필요로 했지만 이제 이것을  Predator라는 인터페이스 대체할 수 있게 되었다.
//tiger, lion은 각각 Tiger,Lion의 객체이기도 하지만 Predator인터페이시의 객체이기도 하기 때문에 위와 같이
//Predator를 자료형의 타입으로 사용할 수 있는 것이다.
//상속에서 공부했던 IS-A관계가 인터페이스에도 마찬가지로 적용된다.
//"Tiger is a Predator", "Lion is a Predator"가 성립된다. 
//tiger - Tiger클래스의 객체, Predator인터페이스의 객체
//lion - Lion 클래스의 객체, Predator인터페이스의 객체
//이와 같이 객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성(폴리모피즘)이라고 하는데 이것에 대해서는
//"다형성" 챕터에서 자세히 다루도록 한다. 
//이제 어떤 육성동물이 추가되더라고 ZooKeeper는 feed 메소드를 추가할 필요가 없다.
//다만 육식동물이 추가 될 때마다 다음과 같이 Predator인터페이스를 구현한 클래스를 작성하기만 하면 되는 것이다. 
//class Crocodile extends Animal implements Predator{
//}
//눈치가 빠르다면 이제 왜 인터페이스가 필요한지 감을 잡았을 것이다.
//보통 중요 클래스를 작성하는 입장이라면 
//(여기서는 Zookeeper)가 중요한 클래스이다)
//클래스의 구현체와 상관없이 인터페이시를 기준으로 중요 클래스를 작성해야만 한다. 
//구현체(Tiger,Lion,Crocodile,..)는 늘어날수 있지만 인터페이스(Predator)는 하나이기 때문이다.


public class Sample3 {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger); // feed apple출력
		zooKeeper.feed(lion); //feed banana출력
		// 이전 챕터에서 보았던 Dog클래스와 마찬가지로  Animal을 상속한  Tiger와 Lion이 등장했다.
		// 그리고 사육사 클래스인  ZooKeeper클래스를 위처럼 정의 하였다.
		// ZooKeeper클래스는 호랑이가 왔을때, 사자가 왔을때 각각 다른 feed메소드가 호출된다. 
		//ZooKeeper 클래스의 feed 메소드처럼 입력값의 자료형 타입이 다를 경우
		// (위에서는 Tiger, Lion으로 서로 다르다) 메소드 명을 동일하게(여기서는 메소드명이 feed로 동일하다) 사용할 수 있다. 
		// 이런것을 메소드 오버로딩(Method overloading)이라고 한다
		// 프로그램을 실행하면 다음과 같은 결과가 출력될 것이다.
		// feed apple
		// feed banana
		// 자, 이제 다음을 생각 해 보자.
		// 동물원에 호랑이와 사자뿐이라면 ZooKeeper클래스는 더이상 할일이 없겠지만 악어, 표범등이 계속 추가 된다면
		// ZooKeeper는 육싣동물이 추가될 때마다 매번 다음과 같은 feed메소드를 추가해야 한다. 


		
		
		// 인터페이스의 핵심과 개념
		// 이번 장에서 가장 중요한 부분은 왜 인터페이스가 필요한지에 대해서 이해하는 것이다.
		//육식 동물들의 종류만큼의 feed 메소드가 필요했던 ZooKeeper 클래스를 Predator 인터페이스를 이용하여 구현했더니 
		// 단 한개의 feed 메소드로 구현이 가능해졌다. 
		// 여기서 중요한 점은 메소드의 갯수가 줄어들었다는 점이 아니라 
		// ZooKeeper 클래스가 동물들의 종류에 의존적인 클래스에서 동물들의 종류와 상관없는 독립적인 클래스가 되었다는 점이다.
		//  바로 이 점이 인터페이스의 핵심이다.

		// 이번에는 좀 더 개념적으로 인터페이스를 생각해 보자. 
		// 아마도 여러분은 컴퓨터의 USB 포트에 대해서 알고 있을 것이다. 
		// USB 포트에 연결할 수 있는 기기는 하드디스크, 메모리스틱, 스마트폰 등 무척 많다.
		// 바로 이 USB포트가 물리적 세계의 인터페이스라고 할 수 있다. 
		// USB포트의 규격만 알면 어떤 기기도 만들 수 있다. 
		// 또 컴퓨터는 USB 포트만 제공하고 어떤 기기가 만들어지는 지 신경쓸 필요가 없다. 
		// 바로 이 점이 인터페이스와 매우 비슷하다. 
		/// 위에서 만든 사육사(ZooKeeper)가 어떤 육식동물(Tiger, Lion...)이던지 상관하지 않고 먹이를 주는 것처럼..
		
		// 물리적 세계	자바 세계
		// 컴퓨터	ZooKeeper
		// USB 포트	Predator
		// 하드디스크, 디지털카메라,...	Tiger, Lion, Crocodile,...
	}

}
