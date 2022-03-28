package day1;

public class Sample11 {

	public static void main(String[] args) {
		// 문자열 포매팅
		// 1. 숫자 바로 대입
		System.out.println(String.format("I eat %d apples.", 3)); // "I eat 3 apples." 출력
		// 문자열 포매팅은 String.format 메소드를 사용한다. 
		// 위 예제의 결과값을 보면 알겠지만 위 예제는 문자열 안에 정수 3을 삽입하는 방법을 보여준다. 
		// 문자열 안에서 숫자를 넣고 싶은 자리에 %d 문자를 넣어주고,
		// 삽입할 숫자 3은 두번째 파라미터로 전달했다. 
		// 여기에서 %d는 문자열 포맷 코드라고 부른다. 
		
		// 2. 문자열 바로 대입
		System.out.println(String.format("I eat %s apples", "five")); // "I eat five apples." 출력
		
		// 3. 숫자 값을 나타내는 변수로 대입
		int number = 3;
		System.out.println(String.format("I eat %d apples.", number)); // "I eat 3 apples." 출력
		
		int number1 = 7;
		System.out.println(String.format("I eat %d apples.", number1));
		
		// 4. 2개 이상의 값 넣기
		// 1개가 아닌 여러 개의 값을 넣고 싶을 땐
		int number2= 10;
		String day = "three";
		System.out.println(String.format("I eat %d apples. so I was sick %s days.", number2, day));
		// 2개 이상의 값을 넣으려면 파라미터로 여러개를 전달하면 된다. 

	}

}
