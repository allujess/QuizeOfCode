package stage02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		//한사람당 5번의 기회가 있는 다트게임이라던지 룰렛같은거 할때 

		
		//두 정수와 A와 B를 입력받은 다음 A+B를 출력하시오 
		Scanner sc = new Scanner(System.in);
		
		//아아아 원하는 반복문 n개 만큼 돌릴수있게 하는 숫자 
		System.out.print("돌리고싶은 횟수를 적어주세요 : ");
		
		int T = sc.nextInt();
		
		//T로 인해 n번만큼의 반복문이 돌아가는 프로그램 
		
		for(int i = 1; i < T; i++) {
			
			System.out.print("원하는 첫번째 숫자를 입력하세요 : ");
			int A = sc.nextInt();
			System.out.print("원하는 두번째 숫자를 입력하세요 : ");
			int B = sc.nextInt();
			
			System.out.print("더하신 숫자의 값 입니다 :");
			System.out.println(A+B);
		}
		
	}

}
