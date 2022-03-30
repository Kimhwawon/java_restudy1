package day3;

import java.util.Arrays;

public class Sample3 {

	public static void main(String[] args) {

	        String a = "write once, run anywhere";
	        if (a.contains("wife")) {
	            System.out.println("wife"); // wife 라는 말이 없어서 거짓
	        } else if (a.contains("once") && !a.contains("run")) {
	            System.out.println("once"); // once나 run이있어서 참이지만 !(not) 가 있으니까 거짓으로 변경
	        } else if (!a.contains("everywhere")) {
	            System.out.println("everywhere"); // everywhere는 없어서 거짓이지만 !(not)으로 인해 참으로 변경
	        } else if (a.contains("anywhere")) {
	            System.out.println("anywhere"); // anywhere 있어서 참
	        } else {
	            System.out.println("none");
	        }
	        	// 참이 먼저 자온 everywhere 콘솔에찍힘
	        
	        
	        // while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해보자. 
	 //       int b =0;
	 //       while(b < 1000) {
	  //      	b++;
	   //     	if(b % 1 == 3) {
	 //       		continue;	
	   //     	}
	   //     	System.out.println(b);
	   //     }   
	
	        int result = 0;
	        int i = 1;
	        while (i <= 1000) {
	        	if(i % 3 == 0) { // 3으로 나누어 덜어지는 수는 3의 배수 
	        		result += i;
	        	}
	        	i += 1;
	        }
	        System.out.println(result);  //166833출력

	        
	        // while문 또는 for문을 사용하여 다음과 같이 별*을 표시하는 프로그램을 작성해 보자. 
	         int e = 0;
	         while (true) {
	        	 e+= 1; // while문 수행 시 1씩 증가
	        	 if (e > 5 ) { // i값이 5보다 크면 while문을 벗어난다. 
	        		 break;
	        	 }
	        	 for (int j = 0; j < e; j++) { // i값이 개수만큼 *를 출력한다. 
	        		 System.out.print('*'); 
	        	 }
	        	 System.out.println("");
	         }
	         
	        
	        // for문을 사용해 1부터 100까지의 숫자를 출력해보자. 
	        for(int c = 1; c < 101; c++) {
	        	 System.out.println(c); 	
	        }
	        
	        //  A학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다. 
	        // for each문을 사용하여 A학급의 평균점수를 구해보자. 
	        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
	        int total = 0;
	        for (int mark: marks) { // for each문
	        	total += mark; // a학급의 점수를 모두 더한다. 
	        }
	        float average = (float) total / marks.length; // 평균을 구하기 위해 총 점수를 총 학생수로 나눈다. 
	        System.out.println(average); // 평균 79.0이 출력된다. 
	        	
	       
	       
	        // 2/5 맞춤;;
	        
	        
	        
	        
	        
	        
	        
	}
	
	
	

}
