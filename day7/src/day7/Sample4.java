//package day7;
//default
//접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수, 메소드는 default 접근 제어자가 되어 해당 패키지 내에서만
//접근이 가능하다. 
//house/HouseKim.java
//package house; // 패키지가 동일하다. 
//public class HouseKim{
//	String lastname="kim"; // lastname 은 dafault접근제어자로 설정된다. 
//}
//house/HousePark.java
//package house; //패키지가 동일하다. 
//public class HousePark{
	//String lastname ="park";
	//public static void main(String[] args) {
	//	HouseKim kim = new HouseKim();
	//	System.out.println(kim.lastname); //HouseKim 클래스의 lastname변수를 사용할 수 있다. 
	//}// HouseKim과 HousePark의 패키지는 house로 동일하다. 따라서 HousePark 클래스에서 HouseKim의 lastname 변수에 접근이 가능하다. 

//}
public class Sample4 {
	// 접근 제어자
	// 변수나 메소드의 사용 권한은 다음과 같은 접근 제어자를 사용하여 설정할 수 잇따.
	// 1. private 2. default 3. protected 4. public
	// private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다. 하나씩 순서대로 살펴보자.

	// private 
	// 접근 제어자가  private으로 설정되었다면 private이 붙은 변수, 메소드는 해당 클래스에서만 접근이 가능하다.
	private String secret;
	private String getSecret() {
		return this.secret;
		//위 예제의 secret 변수와 getSercret메소드는 오직 Sample 클래스에서만 접근이 가능하고 다른 클래스에서는 접근이 불가능하다. 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	// protected
	// 접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메소드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은
	// 다른 패키지으 클래스에서만 접근이 가능하다.
	//house/HousePark.java
	// package house; // 패키지가 서로 다르다.
	// public class HousePark{
//	 	protected String lastname = "park";
	// }
	// house/person/EungYongPark.java
	// package house.person; // 패키지가 서로 다르다.
	// import house.House Park;
	// public class EungYongPark extends HousePark{ // HousePark을 상속햇따.
	// public static void main(String[] args) {
//	 	EungYongPark eyp = new EungYongPark();
	// System.out.println(eyp.lastname);  // 상속한 클래스의 protected 변수는 접근이 가능하다.

	// HousePark 클래스를 상속한 EungYongPark 클래스의 패키지는 
	// house.person으로 HousePark의 패키지인 house와 다르지만 HousePark의 lastname 변수가 protected이기 때문에 
	// eyp.lastname과 같은 접근이 가능하다. 
	// 만약 lastname의 접근제어자가 protected 가 아닌 default 접근제어자였다면 
	// eyp.lastname 문장은 컴파일 오류가 발생할 것이다.
	// public
	// 접근제어자가 public으로 설정되었다면 public 접근제어자가 붙은 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다.
	// package house;
	// public class HousePark {
	// protected String lastname = "park";
	// public String info = "this is public message.";
	// }
	// 위 예제의 HousePark의 info 변수는 public 접근 제어자가 붙어 있으므로 어떤 클래스라도 접근이 가능하다.
	// 클래스, 메소드의 접근 제어자
	// 이상과 같이 총 4개의 접근제어자에 대해서 알아보았다. 
	// 위의 예제는 변수만을 대상으로 설명했지만 클래스나 메소드도 마찬가지의 접근제어자 규칙을 따른다.
	//접근제어자를 모두 public으로 설정해도 프로그램은 잘 동작할 것이다. 
	// 하지만 접근제어자를 이용하면 프로그래머의 코딩 실수를 방지할 수 있고 
	// 기타 위험요소를 제거할 수 있는 등의 장점이 있다
	
	
	
	
	
	
	
	
	
}
