package stage01;

import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {

		//3.윤년문제 
		//4년마다 한번씩 2월을 29로 하고 , 음력에서는 5년에 두 번의 비율로 1년을 13개월로 함 
		
		//윤년1 , 아니면 0
		//연도가 4배수이면서 , 100배수가 아닐때 또는 400의 배수일때이다.
		
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		//4의 배수면 1
		//아니면 0
		//연도는 1보다 크거나 4000보다 작거나 같은 수 
		
		if((year % 4)==0) {
			System.out.println(1);
			
		}else if((year % 4) != 0) {
			System.out.println(0);
			
			
		}
		
		
	}

}
