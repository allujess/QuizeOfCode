package stage02;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int a;
			int b;
			
			//while문에 if조건으로걸어서 break해서 빠져나가기  
			
			while(true) {
				
				a = sc.nextInt();
				b = sc.nextInt();
				
				if(a==0 && b==0) {
					break;
				}else {
					System.out.println(a+b);
				}
				
				
			}
			
			
		
	}

}







