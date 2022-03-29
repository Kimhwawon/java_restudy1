package day2;

public class Sample6 {

	public static void main(String[] args) {
		// while문
		// while은 문장을 반복해서 수행해야 할 경우에 사용한다.
		
		// while문의 기본 구조
	//	while (조건문) {
		//    <수행할 문장1>;
		//    <수행할 문장2>;
		//   <수행할 문장3>;    
	//	}
		
		// 조건문이 참인 동안 while문의 수행할 문장들을 반복하여 수행한다.
		// “열 번 찍어 안 넘어 가는 나무 없다” 라는 속담을 자바로 코딩하면
		
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++;
			System.out.println("나무를 " + treeHit + "번 찍었습니다. ");
		if (treeHit == 10) {
			System.out.println("나무 넘어갑니다. ");
		}
		}
		// 위에 예에서 while문의 조건문은 treeHit < 10이다.
		// 즉, treeHit가 10보다 작은 동안에 while문 안의 문장들을 계속 수행한다. 
		// while문 안의 문장을 보면 제일 먼저 treeHit++ 로 treeHit값이 계속 1씩 증가한다. 
		// 그리고 나무를 treeHit번 만큼 찍었음을 알리는 문장을 출력하고 treeHit가 10이 되면
		//"나무가 넘어갑니다"라는 문장을 출력하고 treeHit < 10라는 조건문이 거짓이 되어 while문을 빠져 나가게 된다. 
		// 여기서 treeHit++ 는 프로그래밍을 할 때 매우 자주 사용하는 기법으로 treeHit의 값을 1만큼씩 증가시킬 목적으로 쓰이는 것이다.
		
		
		
		// 무한루프(Loop)
		// 이번에는 무한루프에 대해서 알아보기로 하자. 
		// 무한 루프는 무한히 반복한다는 의미이다. 
		// 자바에서 무한루프는 while문으로 구현 할수 있다. 
		// 우리가 사용하는 프로그램들 중에서 무한루프의 개념을 사용하지 않는 프로그램은 하나도 없을 정도로 무한루프는 자주 사용된다. 
		// 다음은 무한루프의 기본적인 형태이다.
	//	while(true) {
	//		<수행할 문장1>;
	//		<수행할 문장2>;
	//	}
		
		// while의 조건문이 true 이므로 조건문은 항상 참이 된다. 
		// while은 조건문이 참인 동안에 while에 속해 있는 문장들을 계속해서 수행하므로
		// 위의 예는 무한하게 while문 내의 문장들을 수행할 것이다.
	//	while (true) {
		//	System.out.println("Ctrl-C 를 눌러야 while문을 빠져 나갈 수 있습니다.");
			// 실행 하면 Ctrl-C 를 눌러야 while문을 빠져 나갈 수 있습니다 계속 나옴
	//	}
		
		// while문 빠져 나가기 (break)
		// while 문은 조건문이 참인 동안 계속해서 while문 안의 내용을 반복하여 수행한다. 
		// 하지만 강제로 while 문을 빠져나가야 할 때도 있다.
		// 커피 자판기를 생각해 보자. 
		// 커피가 자판기 안에 충분하게 있을 때는 항상 "돈을 받으면 커피를 줘라" 라는 조건문을 가진 while문이 수행된다.
		// 자판기가 제 역할을 하려면 커피의 양을 따로이 검사를 해서 커피가 다 떨어지면 while문을 멈추게 하고 "판매중지"란 문구를 자판기에 보여야 할 것이다. 
		// 이렇게 while 문을 강제로 멈춰야 할 때 사용하는 것이 바로 break이다.
		
		
		int money = 300;
		int coffee = 10;
	
		while (money > 0 ) {
			System.out.println("돈을 받았으니 커피를 줍니다. ");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다. ");
			if (coffee == 0 ) {
			System.out.println("커피가 다 떨어졌습니다. 팬마를 중지합니다. ");
			break;
			
			// money가 300으로 고정되어 있으니까 while (money > 0)에서 money는 0보다 크기 때문에 항상 참이다.
			// 따라서 무한 루프를 돌게 된다. 그리고 while문이 수행되면 coffee--에 의해서 coffee의 개수가 한 개씩 줄어들게 된다. 
			// 만약 coffee가 0이 되면 if (coffee == 0) 문장이 참이 되므로 break가 호출되어 while문을 빠져 나간다.
			
			}
		}
		
		
		// while문 조건문으로 돌아가기 (continue)
		// while문 안의 문장을 수행할 때 어떤 조건을 검사해서 조건에 맞지 않는 경우 
		// while문을 빠져나가는 대신 while문의 맨 처음(조건문)으로 돌아가게 하고 싶은 경우도 있다.
		// 만약 1부터 10까지의 수중에서 홀수만을 출력하는 것을 while문을 이용해서 작성한다고 생각해 보자. 
	
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue; //짝수인 경우 조건문으로 돌아간다. 
			}
			System.out.println(a); // 홀수만 출력된다. 
		}
		// 위의 예는 1부터 10까지의 수 중 홀수만을 출력하는 예이다. 
		// a가 10보다 작은 동안 a는 1만큼씩 계속 증가한다. 
		// if (a % 2 == 0) (2로 나누었을 때 나머지가 0인 경우)이 참이 되는 경우는 a가 짝수일 때이다. 
		// 즉, a가 짝수이면 continue 문장이 수행된다. 
		// 이 continue문은 while문의 맨 처음(조건문: a<10)으로 돌아가게 하는 명령어이다. 
		// 따라서 위의 예에서 a가 짝수이면 System.out.println(a)는 수행되지 않기 때문에 홀수만 출력될 것이다.
		
	
	}
}
		
		
		
		
		
		
	


