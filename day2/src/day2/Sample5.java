package day2;

public class Sample5 {

	public static void main(String[] args) {
		// switch/case문은 if문과 비슷하지만 좀 더 정형화된 조건 판단문이다. 
		// switch/case문의 구조는 다음과 같다.
	//	switch(입력변수) {
	//	case 입력값1:...
	//		berak;
	//	case 입력값2:...
	//		break;
	//	default:...
	//		break;
	//	}
		
		// 입력변수의 값과 일치하는 case입력값(입력값1, 입력값2,...)이 있다면 해당 case문에 속한 문장들이 실행된다. 
		// case문마다 break라는 문장이 있는데 해당 case문을 실행 한 뒤 switch문을 빠져나가기 위한 것이다. 
		// 만약 break문이 빠져 있다면 그 다음의 case 문이 실행된다. 
		
		int month = 8;
		String monthString = "";
		switch(month) {
			case 1 : monthString = "January";
					break;
			case 2 : monthString = "February";
					break;
			case 3 : monthString = "March";
					break;
			case 4 : monthString = "April";
					break;
			case 5 : monthString = "May";
					break;
			case 6 : monthString = "June";
					break;
			case 7 : monthString = "July";
					break;
			case 8 : monthString = "August";
					break;
			case 9 : monthString = "September";
					break;
			case 10 : monthString = "October";
					break;
			case 11 : monthString = "November";
					break;
			case 12 : monthString = "December";
					break;
			default: monthString = "Invalid month";
					break;
		}
		System.out.println(monthString);
		
	}

}

// switch문의 입력이 1이면 "January"라는 문자열이, 12면 "December"라는 문자열이 출력되는 예제이다. 
// 위의 예는 month가 8로 고정되어 있기 때문에 "August"라는 문자열이 출력될 것이다.
// 위 switch문은 month의 값이 1이면 case 1: 문장이 실행되고 2이면 case 2: 문장이, 3이면 case 3: ... 이런식으로 수행되게 된다. 
// 만약 month에 1에서 12사이의 숫자가 아닌 다른 값이 저장되어 있다면 default: 문장이 수행된다.
// 위와 같이 입력값이 정형화되어 있는 경우 if문보다는 switch/case문을 쓰는것이 가독성에서 좀 더 유리하다.
