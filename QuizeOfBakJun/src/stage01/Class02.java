package stage01;

import java.util.Scanner;

public class Class02 {

	public static void main(String[] args) {

		
		//1.두 정수 A와 B가 주어졌을때, A와 B를 비교하는 프로그램을 작성하시오 .
		//10,000 ≤ A, B ≤ 10,000 제한
		
	/*	Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		
		if(a > b) {
			System.out.println(">");
			
		}else if(a < b) {
			System.out.println("<");
			
		}else if(a == b) {
			System.out.println("==");
			
		}else {
			System.out.println("~_~");
		} */
		
		//2. 시험점수를 입력받아 90~100점은 A,  80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
				
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		
		}else if(score >= 80) {
			System.out.println("B");
			
		}else if(score >= 70) {
			System.out.println("C");
			
		}else if(score >= 60) {
			System.out.println("D");
			
		}else {
			System.out.println("F");
		}	
		
		
	}

}











