package stage02;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//true로 돌아가는 while문 안에 break해서 조건걸어서 빠져나오게 하기 
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) break;
			System.out.println(a+b);
			
		}
		
	}

}
