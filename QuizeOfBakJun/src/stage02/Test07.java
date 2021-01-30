package stage02;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 반복횟수를 입력하세요 : ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			

			//i가 돌때마다 증감하므로 찍어주면 1부터 올라가는것을 볼 수 있습네다 	
			System.out.println("Case #"+i+": "+(a+b));
			
		}
		
		
	}

}
