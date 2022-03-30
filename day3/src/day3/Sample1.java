package day3;

public class Sample1 {

	public static void main(String[] args) {
		// for문 
		// for문은 예제를 통해서 알아보는 것이 가장 쉽다. 
		
		// 전형적인 for문z
		String[] numbers = {"one", "two", "three"};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		// numbers 배열의 첫번째 요소부터 마지막 요소까지 출력하는 예이다.
		// for문의 조건문은 세미콜론(;)을 구분자로 세 부분을 나뉘어진다. 
		// for(초기치; 조건문; 증가치){
		//	}
		// 위 예에서 초기치는 int i=0이 되고 조거문은 i<numbers.length 그리고 증가치는 i++ 이된다. 
		// 즉 i값이 numbers의 갯수보다 작은 동안 계속 i값을 1씩 증가시킨다는 의미이다. 
		// while문과 비슷하지만 뭔가 컴팩트하게 잘 짜여진 느낌이 나는것이 for문의 매력임

		// for문으 예제
		// for문의 쓰임새를 알기 위해서 다음을 가정해 보자. 
		// "총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. "
		// 합격인지 불합격인지에 대한 결과를 보여준다. 
		// 우선 5명의 학생의 시험성적을 다음과 같이 표현했다.
		int[] marks = {90, 25, 67, 45, 80};
		// 1번 학생은 90점이고 5번학생은 80점이다. 
		for (int i=0; i<marks.length; i++) {
			if (marks[i] >= 60) {
				System.out.println((i + 1) + "번 학생은 합격입니다. ");
			}else {
				System.out.println((i + 1) + "번 학생은 불합격입니다. ");
			}
		}
		// i값이 1씩증가하면 for문 안의 문장들이 수행된다. 
		// 따라서 marks[i]는 차례로 90, 25, 67, 45, 80의 값을 갖게 된다. 
		// marks[i]가 60이상이면 합격 메시지를 출력하고 
		// 60점을 넘지 않으면 불합격 메세지를 출력한다. 
		// i가 marks의 갯수인 5보다 크게되면 for문이 중지된다. 
		
		
		//for와 continue
		// while 문에서 알아보았던 continue가 for문에도 동일하게 적용된다. 
		// 즉, for문 안의 문장을 수행하는 도중에 continue문을 만나면 for문의 처음으로 돌아간다. 
		// 위의 에제를 그대로 이용해서 60점 이상인 사람에게는 축하 메세지를 보내고 나머지 사람에게는 아무런 메세지도 전하지 않는
		// 프로그램을 만들어 보자. 
		int[] score = {90, 25, 67, 45, 80};
		for (int i = 0; i<score.length; i++) {
			if (score[i] < 60){
				continue;
			}
			System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다. ");
		}
		// 점수가 60점 미만인 학생일 경우에는 score[i] < 60 이 참이 되어 continue문이 수행된다. 
		// 따라서 축하 메세지를 출력하는 부분을 수행해지 않고 for문의 첫부분으로 돌아가게 된다. 
		
		// 이중 for문
		// for문을 두 번 이용하면 아주 간단하게 구구단을 출력해 볼 수가 있따. 
		for(int i = 2; i<10; i++) {
		for(int j=1; j<10; j++) {
			System.out.println(i*j+" ");
			}
			System.out.println("");
		}
		// 위의 예를 보면 for가 두 번 사용되었다.
		// 먼저 2부터9까지의 숫자가 차례로 i에 대입된다.
		// i가 처음 2일 때 다시 for문을 만나게 된다. 
		// 이제 1부터 9까지의 숫자가 j에 대입되고 그 다음 문장인 
		// System.out.println(i*j+" ");를 수행한다. 
		// 따라서 i가 2일때  2*1, 2*2, 2*9까지 차레로 수행되며 그 값을 출력하게 된다. 
		// 그 다음에는 i가 3일때 역시 2일때와 마차가지로 수행될 것이고 i가 9일때까지 계속 반복하게 된다. 
	}

}
