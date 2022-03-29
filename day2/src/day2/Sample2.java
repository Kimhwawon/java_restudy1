package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample2 {

	// 리스트(List)
	// 리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다. 
	// 리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점이다. 
	// 배열은 크기가 정해져 있다.
	// 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을 수는 없다. 
	// 하지만 리스트는 크기가 정해져 있지 않아 원한느 만큼의 값을 담을수 있다. 
	
	// 박찬호 선수의 투구스피드를 저장해야 한다고 가정해 보자
	// 배열을 이용하여 쿠구수를 저장할 수 있을까?
	// 1회에 투구수가 3개도 될 수 있고 100개도 될 수 있다.
	// 프로그래밍 시 크기를 알수 있는 상황도 있지만 명확한 크기를 알 수 없는 경우가 더 많다.
	// 이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다. 
	
	
	public static void main(String[] args) {
		// ArrayList
		// add
		// 박찬호 선수가 총 3번의 투구를 138, 129, 142(km)의 속도로 던졌다면 다음과 같이 코드를 작성할 수 있다.
	//	ArrayList pitches = new ArrayList();
	//	pitches.add("138");
	//	pitches.add("129");
	//	pitches.add("142");
		// ArrayList를 사용하기 위해서는 import java.util.ArrayList와 같이 ArrayList를 먼저 import 해야함.
		
		// ArrayList객체인 pitches에 ad라는 메소드를 이용하여 투구 스피드를 저장했다.
		// 만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 삽입할 위치를 파라미터로 넘겨주어야 한다. 
	//	pitches.add(0, "133"); // 첫번째 위치에 133삽입
	//	pitches.add(1, "133"); // 두번째 위치에 133삽입
		
		
		// get
		// 박찬호선수의 2번째 투구 스피드를 출력하고 싶다면 다음과 같이 한다. 
	//	System.out.println(pitches.get(1));
		// ArrayList의 get메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다. 
		
		// size
		// size 메소드는 ArrayList의 갯수를 리턴한다. 
	//	System.out.println(pitches.size());
		
		// contains
		// contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴한다. 
	//	System.out.println(pitches.contains("142")); //pitches 객체는 142 값을 포함하고 있으므로 true가 출력된다. 
		
		// remove
		// remove 메소드에는 2가지 방식이 있다. (이름은 같지만 립력파라미터가 다르다)
		// 1. remove(객체)
		// 2. remove(인덱스)
		// 첫 번째 remove(객체)의 경우는 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과(true, false)를 리턴한다. 
	//	System.out.println(pitches.remove("129"));
		// "129"라는 항목이 성공적으로 삭제되고 true를 리턴한다. 
		// 두 번째 remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다. 
	//	System.out.println(pitches.remove(0));
		// 삭제된후 리턴
		
		// 제네릭스(Generics)
		// 제네릭스 (Generics)는 자바 J2SE5.0 이후에 도입된 개념이다.
	//	ArrayList<String> pitches1 = new ArrayList<String>();
	//	ArrayList<String> pitches2 = new ArrayList<>(); // 선호되는 방식
		// <String>이라는 제네릭스 표현식은 "ArrayList"안에 담을 수 있는 자료형은 String 타입 뿐이다.
		// 라는 것을 의미한다.
		// 여기서는 제레릭스 타입으로 String 자료형만을 예로 들었지만 
		// <Integger>, <Animal>, <Dog> 등 어떤 자료형도 사용할 수 있다. 
		// 즉, 제네릭스를 이용하면 좀 더 명확한 타입체크가 가능해 진다. 
		// 이것은 코드를 작성할 때도 몇가지 이득을 준다. 
		// 우선 제네릭스를 사용하지 않은 경우를 생각해 보자. 
	//	ArrayList pitches = new ArrayList();
	//	aList.add("138");
	//	aList.add("129");
		
	//	String one = (String) pitches.get(0);
	//	String two = (String) pitches.get(1);
		// 위처럼 제네릭스를 사용하지 않을 경우에는 ArrayList안에 추가되는 개체는 Object자료형으로 인식된다. 
		// Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다. 
		// 따라서 ArrayList 객체인 pitches에 값을 넣을 때는 문제가 안되지만 값을 가져올 경우에는
		// 항상 Object 자료형에서 자로형에서 String자료형으로 다음과 같이 형변환(casting)을 해 주어야만 한다.
	//	String one = (String) pitches.get(0); // Object 자료형을 String 자료형으로 캐스팅한다. 
		// 또 한가지 주의할 점은 pitches안에는 String객체 이외의 객체도 넣을 수 있기 때문에 형 변환 과정에정에서 
		// 잘못된 형환으로 인한 오류가 발생할 가능성이 있다는 점이다. 
		// 바로 이러한 점이 제네릭스의 탄생 이유이기도 하 다. 
		// 위 코드를 제네릭스를 사용하여 변경하면 다음과 같이 된다. 
	//	ArrayList<String> pitches = new ArrayList<>();
	//	aList.add("138");
	//	aList.add("129");
		
	//	String one =  pitches.get(0); //형 변환이 필요없다. 
	//	String two =  pitches.get(1); //형 변환이 필요없다. 
		// 제네릭스로 자료형을 선언하기만 하면 그 이후로는 자료형에 대한 형변환 과정이 필요없다. 
		// 이미 컴파일러가 pitches에는 반드시 String  자료형만이 추가 되어야 함을 알기 때문이다. 
		// 이렇게 제네릭스를 이용하면 형변환에 의한 불필요한 코딩과 잘못된 형변환에 의한 런타임 오류를 방지할 수 있따. 
		
		// 다양한 방법으로 ArrayList 만들기
		// ArrayList의 add 메소드를 사용하면 다음처럼 ArrayList 객체에 요소를 추가할 수 있다. 
		
	//	ArrayList<String> pitches = new ArrayList<>(); //제네릭스를 사용한 표현
	//	pitches.add("138");
	//	pitches.add("129");
	//	pitches.add("142");
	//	System.out.println(pitches); // [138, 129, 142] 출력
		
		
	//	String[] data = {"138", "129", "142"}; // 이미 투구수 데이터 배열이 있다. 
	//	ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
	//	System.out.println(pitches); // [138, 129, 142]출력
		
		// String 배열 대신 String자료형을 여러개 전달하여 생성할 수도 있다. 
	//	ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
	//	System.out.println(pitches);
		
		
		// 리스트 정렬하기
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		pitches.sort(Comparator.naturalOrder()); //오름 차순으로 정렬
		System.out.println(pitches); // [129, 138, 142] 출력
		
		// sort메소드에는 정렬기준을 파라미터로 전달해야 한다. 
		// 정렬기준에는 다음처럼 오름차순, 내림차순이 있다. 
		// 오름차순(순방향)정렬 - Comparator.naturalOrder()
		// 내침차순(역방향)정렬 - Comparator.reverseOrder()
		
		// sort메소드로 정렬후에 pitches를 출력하면 [129, 138, 142] 처럼 오름차순으로 정렬되어 출력되는 것을 확인할수 잇따.  
		
		
		
		
	
	}

}
