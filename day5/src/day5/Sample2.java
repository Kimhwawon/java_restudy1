package day5;

//생성자 
//이번에는 클래스의 생성자(Constructor)에 대하여 알아보자. 

class Animal{
	String name;
	void setName(String name) {
		this.name = name;
	}
}


//디폴트 생성자
//이번에는 디폴트 생성자에 대하여 알아보자.
class Dog extends Animal {
//	void sleep() {
//		System.out.println(this.name + "zzz");
	//}
//}
	Dog(){	
	}
	void sleep() {
		System.out.println(this.name + "zzz");
	}
	// 첫번째 코드와 두번째 코드의 차이점은 무엇일까?
	//두번 째 코드에는 생성자가 구현되어 있다.
	// 생성자의 이비력 항목이 없고 생성자 내부에 아무 내용이 없는 위와 같은 생성자를 디폴트 생성자라고 부른다. 
	// 위와 같이 디폴트 생성자를 구현하면 newDog()로 Dog클래스의 객체가 만들어 질 때 위에 구현한 디폴트 생성자가 실행될 것이다.
	// 만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 위와같은 디폴트 생성자를 추가한다.
	// 하지만 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 추가하지 않는다. 



//dog객체의 name변수에 아무런 값도 설정하지 않았기 때문에 null이 출력될 것이다.
//이렇듯 HouseDog클래스는 코딩하기에 따라 객체변수 name에 값을 설정할 수 도 있고 설정 안할 수도 있다.
//그렇다면 name이라는 개체변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제할 수 있는 방법은 없을까?
//생성자를 이용하면 된다. 
//HouseDog클래스 가장 상단에 다음과 같은 메소드를 추가해 보자. 

	
	class HouseDog extends Dog{
	HouseDog(String name){
		this.setName(name);
		
	}
	// 생성자 오버로딩
	// 메소드에 오버로딩이 있는 것과 마찬가질조 생성자에도 오버로딩이 있다.
	// 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수있다.
	// 즉, 다음처럼 열어개의 생성자를 만들 수 있다.
	HouseDog(int type){
		if(type == 1) {
			this.setName("yorkshire);
		}else if (type == 2) {
			this.setName("bulldog");
		}
	}

	void sleep() {
		System.out.println(this.name + "zzz in house");
	}
	void sleep(int hour) {
		System.out.println(this.name + "zzz in house for " + hour + "hous");
	}
	
	
}

public class Sample2 {
	public static void main(String[] args) {
	//	HouseDog houseDog = new HouseDog();
	//	houseDog.setName("happy");
	//	houseDog.sleep();
	//	houseDog.sleep(3);
		// Animal,Dog,HouseDog클래스들이 준비 되었다면 이제 main메소드를 다음과 같이 수정한 후 실행 해보자.
		//	HouseDog dog = new HouseDog();
		//	System.out.println(dog.name); // null출력
		
		// 위 메소드처럼 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 안흔 메소드를 생성자라고 한다. 
		// 생성자의 규칙
		// 1.클래스명과 메소드명이 동일하다.
		// 2. 리턴타입을 정의하지 않는다.(void도 사용하지 않는다.)
		// 생성자는 개체가 생성될 때 호출된다.
		// 즉, 생성자는 다음과 같이 new키워드가 사용될 때 호출된다. 
		// new 클래스명(입력인수,...)
		// 생성자는 메소드와 마찬가지로 다양한 입력을 받을 수 있다.
		// 우리가 HouseDog클래스에 만든 생성자는 다음과 같이 입력값으로 문자열을 필요로 하는 생성자이다. 
		// HouseDog(String name){
		// this.setName(name);
		// }
		// 따라서 다음과 같이 new키워드로 객체를 만들때 문자열을 전달해야만 한다.
		// HouseDog dog = new HouseDog("happy"); // 생성자 호출 시 문자열을 전달해야 한다.
		// 만약 다음처럼 코딩하면 컴파일 오류가 발생할 것이다. 
		// HouseDog dog = new HouseDog();
		// 오류가 발생하는 이유는 객체 생성 방법이 생성자의 규칙과 맞지 않기 때문이다.
		// 생성자가 선언된 경우 생성자의 규칙대로만 객체를 생성할 수 있다.
		// HouseDog클래스에 위와 같이 생성자를 선언하면 new HouseDog()을 사용하는 main메소드에서 컴파일 오류가 발생할 것이다.
		// 다음처럼 main메서드를 수정하자. 

		//HouseDog dog = new HouseDog("happy");
	//	System.out.println(dog.name);
		// 이제 main메소드를 실행하면 생성자에 의해 name객체변수에 값이 설정되어 다음의 결과가 출력된다. 
		// happy
		// 이렇듯 생성자를 사용하면 setName("happy")와 같은 필수적인 행동을 객체 생성시에 제어할 수 있다. 
		
		
		HouseDog happy = new HouseDog("happy");
		HouseDog yorkshire = new HouseDog(1);
		System.out.println(happy.name); // happy 출력
		System.out.println(yorkshire.name); // yorkshire 출력
		// 위의 HouserDog클래스는 두 개의 생성자가 있다.
		// 하나는  String 자료형을 입력으로 받는 생성자이고 다른 하나는 int 자료형을 입력으로 받는 생성자이다.
		// 두 생성자의 차이는 입력 항목이다.
		// 이렇게 입력 항목이 다른 생성자를 여러 개 만들 수 있는데 이런 것을 생성자 오버로딩(Overloading)이라고 한다.
		// 메소드 오버로딩과 동일한 개념이다.
		// 이제 HouseDog 클래스의 객체는 다음처럼 두 가지 방법으로 생성할 수 있다.
		// HouseDog happy = new HouseDog("happy"); // 문자열로 생성
		// HouseDog yorkshire = new HouseDog(1); // 숫자값으로 생성
	}

}
}
