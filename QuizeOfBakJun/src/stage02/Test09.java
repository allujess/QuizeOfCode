package stage02;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("원하는 줄만큼 별을 찍어보세요 : ");
		
		int n = sc.nextInt();
		
		//몇 줄인지 	
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j < i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
	}

}
