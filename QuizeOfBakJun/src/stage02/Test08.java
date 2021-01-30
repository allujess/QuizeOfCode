package stage02;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 반복횟수를 입력하세요 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("첫번째 숫자를 입력하세요 : ");
			int a = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요 : ");
			int b = sc.nextInt();
			
			System.out.println("Case #"+ i + ": " + a + " + "+ b + " = "+ (a+b));
		}
		
	}

}
