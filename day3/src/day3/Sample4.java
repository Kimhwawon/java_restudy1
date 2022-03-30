package day3;

public class Sample4 {
		// 객체지향 프로그래밍
		// 계산기에 숫자 3을 입력 하고 + 기호를 입력한 후 4를 입력하면 결과값으로 7을 보여준다. 
		// 다시한번 + 기호를 입력한 후 3을 입력하면 기존 결과값 7에 3을 더해 10을 보여 준다. 
		// 즉 계산기는 이전에 계산한 결과값을 항상 메모리 어딘가에 저장하고 있어야 한다. 
		// 이런 내용을 자바 코드로 구현해 보자. 계산기의 "더하기" 기능을 구현한 코드는 다음과 같다. 
	static int result = 0;
		
		static int add(int num) {
			result += num;
			return result;
		}
	
		public static void main(String[] args) {
				System.out.println(Sample4.add(3));
				System.out.println(Sample4.add(4));
			}
		
		
		// 그런데 만일 sample 클래스에서 2대의 계산기가 필요한 상황이 발생하면 어떻게 해야 할까?
		// 각 계산기는 각각의 결과값을 유지 해야하기 때문에 위와 같이 calculator 클래스 하나만으로는 결과값을 따로 유지할 수 없다. 
		// 이러한 상황을 해결하려면 다음과 같이 클래스를 각각 따로 만들어야 한다. 
		
		class Calculator1 {
			static int result = 0;
			
			static int add(int num) {
				result += num ;
				return result;
			}
		}
		
		class Calculator2{
			static int result = 0;
			
			static int add (int num) {
				result += num;
				return result;
			}
		}
		
		
		public class Sample{
			public static void main(String[] args) {
				System.out.println(Calculator1.add(3)); //3
				System.out.println(Calculator1.add(4)); //7
				
				System.out.println(Calculator2.add(3)); // 3
				System.out.println(Calculator2.add(7)); // 10
				
			}
		}
		
		
		// 계산기 1의 결과값이 계산기 2에 아무 영향을 끼치지 않음을 확인할 수 있다.
		// 하지만 계산기가 3개, 5개, 10개로 점점 더 많이 필요해진다면 어떻게 해야 할까?
		// 그때마다 클래스를 추가할 것인가?
		// 여기에 빼기나 곱하기 등의 기능을 추가해야 한다면 상황은 점점 더 어려워질 것이다. 
		
		// 아직 객체에 대해 배우지 않았지만, 위와같은 경우 객체를 사용하면 다음과 같이 간단하게 해결할 수 있따. 
		
		
		
		class Calculator {
			int result = 0;
			
			int add(int num) {
				result += num;
				return result;
			}
		}
		
		public class Sample1{
			public static void main(String[] args) {
				Calculator cal1 = new Calculator(); // 계산기1 객체를 생성한다.
				Calculator cal2 = new Calculator(); // 계산기2 객체를 생성한다. 
				
				System.out.println(cal1.add(3)); //3
				System.out.println(cal1.add(4)); // 7
				
				System.out.println(cal2.add(3)); // 3
				System.out.println(cal2.add(7)); // 10
				
				// Calculator 클래스로 만든 별개의 계산기 cal1, cal2(이것을 객체라고 부른다. )
				// 각각의 역할을 수행한다. 
				// 그리고 계산기 (cal1, cal2의 결과값을 역시 다른 계산기의 결과값과 상관없이 독립적인 값을 유지한다. 
				// 객체를 사용하면 계산기 대수가 늘어나더라도 객체를 생성만 하면 되기 때문에 클래스만을 사용하는 경우와 달리 매우 간단해진다. 
				
				// 만약 빼기 기능을 추가하려면 Calculator 클래스에 다음처럼  sub 메소드를 추가하면 된다. 
				
				class Calculator{
					int result = 0;
					
					int add(int num) {
						result += num;
						return result;
					}
					
					int sub (int num) {
						result -= num;
						return result;
					}
				}
				// 객체지향 프로그래밍의 이점은 단순히 이것만이 아니다. 
				// 하지만 이것 하나만으로도 
				// "도대체 왜 객체가 필요한 것일까?" 라는 근본 적인 물음에 대한 해답이 되었을 것이다. 
				
			}
		}
	}