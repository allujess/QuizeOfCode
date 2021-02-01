package stage02;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		//1부터 N까지 출력하는문제 
		//1부터 n까지 한줄에 하나씩 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		int n = sc.nextInt();
		
		//이거는 1부터 시작이라면 
		for(int i = 1; i <= n; i++) {
			
			System.out.println(i);
		}
		
	}

}
