package day1;

public class Sample4 {

	public static void main(String[] args) {
		// 자바는 ++, -- 기호를 이용하여 값을 증가하거나 감소시킬 수 있다. 
		// 이러한 ++, -- 기호를 증감 연산자라고도 한다. 
		
		//int i = 0; 
		//int j = 10;
		//i++;
		//j--;
		//System.out.println(i); // 1출력
		//System.out.println(j); // 9출력
		// ++는 값을 1만큼 증가 시키고 
		// -- 는 값을 1만큼 감소 시킨다
		
		int i = 0; 
		System.out.println(i++); // 0출력
		System.out.println(i); // 1출력
		
		// i++ 값이 참조된 후에 증가
		// j-- 값이 참조되기 전에 증가 
		System.out.println(++i); //2
		System.out.println(++i); // 3
		System.out.println(i); // 3
		

	}

}
