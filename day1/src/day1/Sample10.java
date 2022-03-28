package day1;

public class Sample10 {

	public static void main(String[] args) {
		// 문자열 내장 메소드
		// String 자료형의 내장 메소드 중에서 자주 사용되는 것들에 대해서 알아보자. 
		
		// equals
		// 두 개의 문자열이 동일한지를 비교하여 결과값을 리턴한다. 
		String a = "hello";
		String b = "jaba";
		String c = "hello";
		System.out.println(a.equals(b)); // false 출력
		System.out.println(a.equals(c)); // true 출력
		// 문자열의 값을 비교할때는 반드시 equals를 사용해야한다.
		
		// indexOf
		// indexOf는 문자열에서 특정 문자가 시작되는 위치 (인덱스)를 리턴한다.
		String d = "Hello Java";
		// 위와 같은 d 문자열에서 "Java"라는 문자열이 시작되는 위치를 알고 싶은 경우
		// indexOf를 다음과 같이 사용할 수 있다. 
		String e = "Hello Java";
		System.out.println(e.indexOf("Java")); //6 출력
		
		
		// contains
		// contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다. 
		String f = "Hello Java";
		System.out.println(f.contains("Java")); // true출력
		// 문자열 f는 "Java"라는 문자열을 포함하고 있기 때문에 true를 리턴한다. 
		
		
		
		// charAt
		// charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.
		String g = "Hello Java";
		// 위와 같은 g문자열에서 "J"라는 문자는 6번째 인덱스에 위치한 문자이다. 
		// 6이라는 숫자로 "J"라는 문자를 얻기 위해서는 다음과 같이 charAt을 사용한다.
		String h = "Hello Java";
		System.out.println(h.charAt(6)); // "J" 출력
		
		
		
		// replaceAll
		// replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다. 
		String i = "Hello Java";
		System.out.println(i.replaceAll("Java", "World")); // Hello World 출력
		
		
		
		// substring
		// substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다 .
		
		String j = "Hello Java";
		System.out.println(j.substring(0,4)); // Hell 출력
		// 위처럼 substring(시작위치, 끝위치)와 같이 사용하면 문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다. 
		// 단 끝위치는 포함이 안된다는 점에 주의하자. 이것은 다음과 같은 수학의 식과 비슷하다. 
		// 시작위치 <= j < 끝위치
		
		
		// toUpperCase
		// toUpperCase는 문자열을 모두 대문자로 변경할 때 사용한다. (모두 소문자로 변경할때 toLowerCase를 사용한다. )
		
		String k = "Hello Java";
		System.out.println(k.toUpperCase()); // HELLO JAVA 출력
		
		
		// split
		// split 메소드는 문자열을 특정 구분자로 분리하는 메소드이다. 
		
		String l = "a:b:c:d";
		String[] result = l.split(":"); // result는 {"a", "b", "c", "d"}
		
		
		
		

	}

}
