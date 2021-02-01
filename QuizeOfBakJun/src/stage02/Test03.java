package stage02;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		//n이 주워졋을때 1부터 n까지 합을 구하는 프로그램 
		//누적하는 값이 필요함 	sum 
		//n은 그냥 반복문 수를 정하는 느낌적인느낌 	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 값 : ");
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			//n까지 증가하는 i를 sum에 누적함 	
			sum += i;
			
		}
		
		//1부터 누적한 값을 출력해주기 
		System.out.println(sum);
		
	}

}
