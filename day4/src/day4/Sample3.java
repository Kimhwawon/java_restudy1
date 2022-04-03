package day4;
//Call by value
//메소드에 값(pirimitive type)을 전달하는 것과 객체(reference type)를 전달하는것에는 큰 차이가 있다.
//이것은 매우 중요하기 때문에 이전에 잠깐 언급했지만 다시한번 자세히 알아보자. 
//결론부터 얘기한다면 메소드에 객체를 전달한 경우 메소드에서 객체의 객체변수(속성)값을 변경할 수 있따.
//다음의 예제를 보자. 
class Updater{
	void update(Counter counter) {
		counter.count++;
	}
}
class Counter{
	int count = 0;//객채변수
}


public class Sample3 {
	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("before update " + myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);
		System.out.println("after upate : " + myCounter.count);
	}
	// // 한 개의 자바파일에 2개 이상의 클래스 선언하기
	// sample.java라는 파일 내에 Sample3,Updater,Counter라는 클래스 3개가 등장했다.
	// 이것은 조금 특이하지만 쿨론 가능한 코드이다.
	// 하나의 java파일내에는 여러개의 클래스를 선언할 수 있다.
	// 단 파일명이 Sample3.java라면 Sample3.java내의 Ssmple3클래스는 public으로 선언하라는 관례(규칙)가 있다. 

	//Updater 클래스는 전달받은 숫자를 1만큼 증가시키는 update라는 메소드를 가지고 있다.
	// Counter클래스는 count라는 객체변수를 가지고 있다.
	// Sample3클래스의 main메소도는 Counter클래스에 의해 생성된 객체의 객체변수 count의 값을 Updater클래스를
	// 이용하여 증가시키려고 시도하는 에제이다. 
	// 하지만 실행 해 보면 다음과 같은 결과 값이 나온다.  
	// before update:0
	// after update:0
	// 객체 변수 count의 값을 update메소드에 넘겨서 변경시키더라도 값에 변화가 없다.
	// 그 이유는 이전 챕터에서 알아본 것과 같이
	// update 메소드는 값(int 자료형)을 던달받았기 때문이다. 
	// 이제 예제를 다음과 같이 변경 해 보자. 
	
	// 이전 예제와의 차이점은 update메소드의 입력항목이다. 
	// 이전 에는 int count와 같이 값을 전달받았따면 지금은 Counter counter와 같이 객체를 전달받도록 변경한 것이다. 
	// update메소드를 호출한느 부분도 다음처럼 바뀌었다. 
	// myUpdater.update(myCounter);
	// 이제 변경된 클래스를 실행 해 보면 다음과 같은 결과가 출력된다. 
	// before update:0
	// after update:1
	// myCounter객체의 count값이 1 만큼 증가 되었다. 
	// 이렇게 메소드의 입력으로 객체를 전달받는 경우에는 메소드가 입력받은 객체를 그대로 사용하기 때문에 메소드가 객체의 속성
	// 값을 변경하면 메소드 수행 후에도 객체의 변경된 속성값이 유지된다. 
}
