package stage02;

import java.util.Scanner;

public class whileTest01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("a를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.println("b를 입력하시오 : ");
		int b = sc.nextInt();
		
		do{
			
			System.out.println(a + b);
			break;
			
		}while (a > 0 || b < 10);
		
	}

}
