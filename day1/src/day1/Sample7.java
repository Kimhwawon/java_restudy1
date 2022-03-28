package day1;

public class Sample7 {

	public static void main(String[] args) {
		// 문자
		// 한 개의 문자 값에 대한 자료형은  char를 이용한다.
		// char 자료형은 다음과 같이 사용한다. 
	//	char a1 = 'a';
		// 주의할 점은 위와 같이 문자값을 ' (단일 인용부호)로 감싸주어야 함
		
		char a1 = 'a'; // 문자로 표현
		char a2 = 97; // 아스키코드로 표현
		char a3 = '\u0061'; // 유니코드로 표현
		
		System.out.println(a1); //a 출력
		System.out.println(a2); // a출력
		System.out.println(a3); // a출력
		
	}

}
