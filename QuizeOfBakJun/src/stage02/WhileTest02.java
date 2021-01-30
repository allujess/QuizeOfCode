package stage02;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		
		//입력이 끝날 때까지 A+B를 출력하는 문제 

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
	}

}
