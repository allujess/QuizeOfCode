package stage02;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요 : ");
		
		int dan = sc.nextInt();
		
		int hang ;
			
			for(hang = 1; hang <=9; hang++) {
				
				//dan이라는 숫자가 들어왔을때 hang은 정해져있으니 dan *hang을 돌려 
				//N단을 출력하는 구구단 프로그램 
				System.out.println(dan + "X" + hang + "=" + dan * hang);
				
			
			
		}
	}

}
