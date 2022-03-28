package day1;

public class Sample8 {

	public static void main(String[] args) {
		// 문자열이란 문장을 뜻한다. 예를 들어 다음과 같은 것들이 문자열이다. 
	//	"Happy Java"
	//	"a"
	//	"123"
		// 하지만 위의 예제는 다음과 같이 표현해도 된다. 
		String a = new String("Happy Java");
		String b = new String("a");
		String c = new String("123");
		
		// new 키워드는 객체를 만들 때 사용한다. 
		// "객체" = 새로 생성된 자료형
		
		
		// 리터럴 표기
		// String a = "happy java" 와 String a = new String("happy java")는 값을 갖게 되지만
		// 완전히 동일하지는 않다. 
		// 첫 번째 방식을 리터럴(literal)표기라고 하는데 객체 생성없이 고정된 값을 
		// 그대로 대입한느 방법을 말한다. 
		// 위 예에서 리터럴 표기법은 "happy java" 라는 문자열을 intem pool 이라는 곳에 저장하고
		// 다음에 다시 동일한 문자열이 선언될때는 cache된 문자열을 리턴한다. 
		// 두번째 방식은 항상 새로운 String객체를 만든다. 
		

	}

}
