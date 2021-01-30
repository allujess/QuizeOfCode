package stage02;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		//^^아나별찍기 거꾸로요?
		

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				
				for(int j = i; j < i; j++) {
					
					System.out.print("*");
				}
				
				System.out.println("");
			}
		
	}

}
