package day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {

	public static void main(String[] args) {
		// for each
		
	//	String[] number = {"one", "two", "three"};
	//	for(int i = 0; i < number.length; i++) {
	//		System.out.println(number[i]);
	//	}
		//위 for문은 다음처럼 for each구조로 변경할 수 있다. 
		
	//	String[] numbers = {"one", "two", "three"};
	//	for(String number: numbers) {
	//		System.out.println(number);
	//	}
		// for each문의 구조는 다음과 같다.
//	for (type ver : iterate) {
	//	body-of-loop
	// }
		// 위에서 iterate루프를 돌릴 객체이고 iterate객체에서 한개씩 순착적으로 var에대입되어for문이 수행된다.
		// iterate로 사용할수 있는 자료형은 루플르 돌릴수 있는 자료형(배열 및 ArrayList등 )만 가능하다. 
		
		
		// 다음은 위 예제를 ArrayList로 구현한 예제이다. for문의 사용법은 String[] 배열을 사용했을 때와 완전히 동일하다. 
		ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for (String number : numbers) {
			System.out.println(number);
		}
		
		//단, for each문은 다로 반복회수를 명시적으로 주는 것이 불가능하고 , 1스텝씩 순차적으로 반복될때만 사용가능하다는 
		// 제약이 있다. 
		
		
		
}
}

