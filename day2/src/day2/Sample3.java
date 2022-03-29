package day2;

import java.util.HashMap;

public class Sample3 {

	public static void main(String[] args) {
		// 맵(Map)
		// "사람"을 예로 들면 누구든지 "이름" = "홍길동", "생일" = "몇 월 며칠" 등으로 구분할 수 있다. 
		// 자바의 맵은 이러한 대응관계를 쉽게 표현할 수 있게 해주는 자료형
		// 맵은 사전 과 비슷하다. 
		// 즉 people이란 단어에 "사람", baseball 이라는 단어에 "야구"라는 듯이 부합되듯이 Map은 key와 value를 한쌍으로 갖는 자료형이다. 
		// Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다. 
		// 맵의 가장 큰 특징이라면 key로 value를 얻어낸다는 점이다. 
		// baseball이란 단어의 뜻을 찾기 위해서 사전의 내용을 순차적으로 모두 검색하는 것이 아니라
		// baseball이라는 단어가 있는 곳만을 펼쳐려보려는 것이다.
		
		// HashMap
		// put
		// key와 value가 String 형태인 HashMap을 만들고 위에서 보았던 예제의 항목값들을 입력해 보자.
	//	HashMap<String, String>map = new HashMap<>();
	//	map.put("people", "사람");
	//	map.put("baseball", "야구");
			//     key       value
		//  HashMap 역시 제네릭스를 이용한다. 위의 HashMap 의 제네릭스는 Key, Value 모두 String 타입이다.
		
		// get
		// key에 해당되는 value값을 얻기 위해서는 다음과 같이 한다. 
	//	System.out.println(map.get("people")); //"사람" 출력
		// get 메소드를 이용하면 value값을 얻을 수 있다. 
		
		// 맵의 key에 해당하는 value가 없을 경우에 get 메소드를 사용하면 다음처럼 null이 리턴된다.
	//	System.out.println(map.get("java")); // null출력
		// 이때 null 대신 디폴트 값을 얻고 싶은 경우에는 getORDefault메소드를 사용한다. 
	//	System.out.println(map.getOrDefault("java", "자바"));
		
		// containsKey
		// containsKey 메소드는 맵에 해당키(key)가 있는지를 조사하여 그 결과값을 리턴한다. 
	//	System.out.println(map.containsKey("people")); // true출력
		// "people" 이라는 키는 존재하므로 true가 출력될 것이다. 
		
		// remove
		// remove 메소드는 맵의 항목을 삭제하는 메소드로 key값에 해당되는 아이템(key,value)을 삭제한 후 그 value값을 리턴한다. 
	//	System.out.println(map.remove("people")); // "사람" 출력
		// "pelple"에 해당되는 아이템 (people:사람)이 삭제된 후 "사람" 이 출력될 것이다. 
		
		// size
		// size 메소드는 map의 갯수를 리턴한다. 
	//	System.out.println(map.size()); // 1출력
		// "people", "baseball" 두 값을 가지고 있다가 "people"항목이 삭제되었으므로 1이 출력될 것이다.
		
		// keySet
		// keySet은 맵의 모든 key 를 모아서 리턴한다. 
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		map.put("soccer", "축구");
		System.out.println(map.keySet()); // [baseball, people, soccer]출력
		
		
		
		
		
		
		

	}

}
