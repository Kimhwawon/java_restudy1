package day5;
//상속
//자바에는 자식 클래스가 부모 클래스의 기능을 그대로 물려받을 수 있는 상속(Inheritance)기능이 있다.
//이전 챕터에서 작성했던 Animal 클래스를 상속하는 Dog 클래스를 만들어 보자 
class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}
//클래스 상속을 위해서는 extends 라는 키워드를 사용한다.
class Dog extends Animal{
	// 부모 클래스의 기능을 확장
	// 이번에는  Dog클래스에 sleep메소드를 추가 해 보자 
	void sleep() {
		System.out.println(this.name+"zzz");
	}
}


//IS-A관계
//Dog클래스는 Animal 클래스는 상속했다.
//즉, Dog는 Animal의 하위 개념이라고 할 수 있다.
//이런 경우 Dog는 Animal에 포함되기 때문에 "개는 동물이다" 라고 표현할 수 있다.

//자바는 이러한 관계를 IS-A관계라고 표현한다. 
//즉 "Dog is a Animal"과 같이 말할 수 있는 관계를 IS-A관계라고 한다. 
//이렇게 즉, 다음과 같은 코딩이 가능하다. 
//Animal dog = new Dog(); // Dog is a Animal
//다만 여기서 한 가지 주의해할 점이 있다. 
//Dog객체를 Animal자료형으로 사용할 경우에는 Dog클래스에만 존재하는 
//sleep메소드를 사용할 수 없다는 점이다.
//이러 경우에는 Animal클래스에 구현된 setName메소드만 사용이 가능하다. 
//하지만 이 반대의 경우, 즉 부모 클래스로 만들어진 객체를 자식 클래스의 자료형으로 사용할 수 없다.
//다음의 코드는 컴파일 오류가 발생한다. 
//Dog dog = new Animal(); // 컴파일 오류:부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.
//이부분을 좀 더 개념적으로 살펴보자. 
//Animal dog = new Dog(); // Dog is a animal (0)
//위 코드를 읽어보면 "개로 만든 객체는 동물 자료형이다." 라고 읽을 수 있다.
//또 다음 코드를 보자. 
//Dog dog = new Animal(); // Animal is a Dog(x)
//역시 개념적으로 읽어보면 "동물로 만든 객체는 개 자료형이다." 로 읽을 수 있을 것이다. 
//근데 뭔가 좀 이상하지 않은가?
//동물로 만든 객체는 "개"자료형 말고 "호랑이" 자료형 또는 "사자" 자료형도 될 수 있지 않은가?

//개념적으로 살펴보아도 두번째 코드는 성립할 수 없다는 것을 알 수 있다. 
//Object클래스
//자바에서 만드는 모든 클래스는  Object클래스를 상속받는다. 
//사실 우리가 만든 Animal클래스는 다음과 기능적으로 완전히 동일하다. 
//하지만 굳이 아래 코드처럼 object클래스를 상속하도록 코딩하지 않아도 자바에서 만들어지는 모든 클래스는
//Object클래스를 자동으로 상속받게끔 되어 있다. 
class HouseDog extends Dog{
	// HouseDog클래스를 실행 해 보면 sleep메소드가 호출되어 다음과 같은 결과가 출력될 것이다. 
	// happy zzz
	// 그런데 HouseDog 처럼 집에서 키우는 개들은 잠시 집에서만 잔다고 한다. 
	// HouseDog클래스로 만들어진 개체들을 sleep메소드 호출 시 "happy zzz"가 아닌 "happy zzz in house"를 출력해야 한다고 가정해 보자.
	// 이렇게 하려면 어떻게 해야 할까?
	// 다음과 같이 HouseDog클래스를 수정해 보자. 
		
	
	
	
	void sleep() {
			System.out.println(this.name + "zzz in house");
		}
		// Dog클래스에 있는  sleep 메소드를  HouseDog에 내용만 조금 변경하여 재 구현하고 실항하니 다음처럼 
		// 원하던 결과값을 얻을 수 있었다. 
		// happy zzz in house
		// HouseDog 클래스에 Dog 클래스와 동일한 형태(입출력이 동일)의 sleep메소드를 구현하면 HouseDog클래의 sleep 메소드가 
		// Dog클래스의 sleep 메소드보다 더 높은 우선순위를 갖게 되어 HouseDog 클래스의  sleep 메소드가 호출되게 된다. 
		// 이렇게 부모클래스의 메소드를 자식 클래스가 동일한 형태로 또 다시 구현하는 행위를 메소드 오버라이딩(Method Overrding)이라고 한다. 

	
	
	
//메소드 오버로딩(Method overloading)
//이번에는 HouseDog클래스에 다음과 같은 메소드를 추가해 보자.("변경"이 아니라 "추가"임에 주의)

	// 이미 sleep이라는 메소드가 있지만 동일한 이름의 sleep메소드를 또 생성할 수 있다.
	// 단, 메소드의 입력항목이 다를 경우만 가능하다.
	// 새로 만든 sleep메소드는 입력항목으로 hour라는 int자료형이 추가 되었다.
	// 이렇든 입력항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩이라고 부른다.
	// 새로만든 sleep메소드를 테스트 하기 위해 main메소드를 다음과 같이 변경하고 실행 해 보자.
	void sleep(int hour) {
	System.out.println(this.name + "zzz in house for " + hour + "hours");
	
}
	// 다중 상속
	// 다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다. 
	// C++, 파이썬등 많은 언어들이 다중 상속을 지원하지만 자바는 다중 상속을 지원하지 않는다. 
	// 만약 자바가 다중 상속을 지원한다면 다음과 같은 코드가 만들어 질 수 있을 것이다.
	// 자바는 다중 상속을 지원하지 않기 때문에 아래의 코드는 실제로는 동작할 수 없는 코드이다. 
	class A{
		public void msg() {
			System.out.println("A message");
		}
	}
	class B{
		public void msg() {
			System.out.println("B message");
		}
	}
	
	
	//class C extends A,B{
	// public static void main(String[] args) {
	// c test = new C();
	//test.msg();
	// 자바가 다중 상속을 지원한다고 가정하고  A,B라는 클래스를 위와 같이 동시에 상송(extends A,B)하도록 했다.
	// 위 main 메소드에서 test.msg(); 실행 시 A클래스의 msg메소드를 실행해야 할까?
	// 아니면 B클래스의 msg메소드를 실행해야 할까?
	// 다중 상속을 지원하게 되면 이렇든 애매모호한 부분이 생기게 된다. 
	// 자바는 이러한 불명확한 부분을 애초에 잘라 낸 언어이다. 

	
	

public class Sample1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name); // poppy출력
		// 이제 Dog클래스는 Animla클래스를 상속하게 되었다. 
		// Dog늘래스에 name이라는 개체변수와  setName이라는 메소드를 만들지 않았지만
		// Animal클래스를 상속했기 때문에 그댈 사용이 가능하다. 
	
		dog.sleep(); // poppy zzz 출력
		// 이제 Dog클래스는  Animal 클래스보다 좀 더 많은 기능 (sleep 메소드가 추가 되었다. )을 가지게 되었다.
		// 이렇듯 보통 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 기능에 더하여 좀 더 많은 기능을 갖도록 작성한다. 
	
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); // happy zzz in house출력
		houseDog.sleep(3); // happy zzz in house for 3 hours 출력
		
		
	}

}
}
