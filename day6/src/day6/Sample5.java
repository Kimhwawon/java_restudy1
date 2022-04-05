package day6;
//추상클래스
//추상클래스(Abstract Class)는 인터페이스의 역할도 하면서 클래스의 기능도 가지고 있는 자바의 돌변변이 같은 클래스이다.
//혹자는 추상클래스는 인터페이스로 대체하는것이 좋은 디자인이라고도 얘기한다. 

//추상클래스에 대해서 알아보기 위해 우리가 작성했던 Predator인터페이스를 다음과 같이 추상클래스로 변경해보자.
abstract class Predator extends Animal{
	abstract String getFood();
	void pirntFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	static int LEG_COUNT = 4;// 추상 클래스의 상수는 static 선언이 필요하다.
	static int speed() {
		 return LEG_COUNT * 30;
	}
}
interface Barkable{
	
}
class Animal{
	
}
//추상클래스를 만들기 위해서는 class 앞에 abstract라고 표기해야 한다.
//또한 인터페이스의 메소드와 같은 역할을 하는 메소드 (여기서는 getFood 메소드)에도 역시 abstract를 붙여야 한다.
//abstract 메소드는 인터페이스의 메소드와 마찬가지로 몸통이 없다.
//즉 abstract클래스를 상속하는 클래스에서 해당 abstract메소드를 구현해야만 하는 것이다.
//그리고 Animal클래스의 기능을 유지하기 위해 Animail 클래스를 상속햇따.
//그리고 인터페이스의 디폴트 메서드는 더이상 사용할 수 없으므로 default키워드를 삭제하여 일반 메서드로 변경했다.
//그리고 LEG_COUNT  상수도 인터페이스에서는 자동으로 static으로 인식하지만 추상클래스는 명식적으로 static이라고 적어 주어야 한다. 
//추상 클래스는 일반 클래스와는 달리 단독으로 객체를 생성할 수 없다. 
//반드시 추상 클래스를 상속한 실제 클래스를 통해서만 객체를 생성할 수 있다.
//Predator 인터페이스를 이와 같이 추상클래스로 변경하면 BarkablePredator 인터페이스는 사용 불가능 하므로 삭제해야 하고
//Tiger,Lion 클래스도 다음과 같이 Predator 추상클래스를 상속하도록 변경해야 한다. 
class Tiger extends Predator implements Barkable{
	
}
class Lion extends Predator implements Barkable{
	
}
class ZooKeeper{
	
}
class Bouncer{
	
}
public class Sample5 {
	

	public static void main(String[] args) {
		// Predator 추상클래스에 선언된 getFood 메소드는 Tiger,Lion 클래스에 이미 구현되어 있으므로 추가할 필요가 없다.
		// 추상클래스에 abstract로 선언된 메소드는 인터페이스의 메소드와 마찬가지로 반드시 구현해야 하는 메소드이다. 
		// 추상 클래스에 abstract 메소드 외에 실제 메소드도 사용할 수 있다.
		// 추상클래스에 실제 메소드를 추가하면 Tiger,Lion 등으로 만들어진 객체에서 그 메소드들을 모두 사용할 수 있게 된다.
		// 원래 인터페이스에서 default 메소드로 사용했던 printFood가 추상 클래스의 실제 메서드에 해당된다. 
		// 인터페이스와 추상 클래스의 차이

		// 자바8 버전부터 인터페이스에 default 메서드가 추가되어 추상 클래스와의 차이점이 살짝 모호해졌다. 
		// 하지만 추상 클래스는 인터페이스와는 달리 일반 클래스처럼 객체변수, 생성자, private 메서드 등을 가질 수 있다.

	}

}
