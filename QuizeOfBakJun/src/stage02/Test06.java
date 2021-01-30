package stage02;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		//자연수 N이 주어질때, N부터 1까지 한줄에 하나씩 출력하는 프로그램	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 숫자를 입력해주세요 : ");
		int n = sc.nextInt();
		
		//10,000보다 작거나 0보다 클때 
		if(n <= 100000 || n > 0) {
			
			for(int i = n; i > 0; i--) {
				System.out.println(i);
			}
		}else {
			System.out.println("숫자는 100000보다 작어야합니다.");

		}

	}

}
