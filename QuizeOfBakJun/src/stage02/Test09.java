package stage02;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		
		//별찍기 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 숫자를 입력하세요 : ");
		
		int n = sc.nextInt();
		
		
		for(int i = 0; i <= n; i++) {
				
			
			//줄에 출력되는거느 n의 수보다 작게 증가하므로 
			for(int j = 0; j < i; j++) {

				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
	}

}
