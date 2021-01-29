package stage01;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

		
		//45분전 일찍 알람설정하기 
		//상근이 시간에서 -45하기
		//근데 이걸 막 뺀다해서 되는게 아니고 24시간 조건에서 
		//빼는거여서 23:40이면 22:55여야함 
		
		//1. 45분전 시간을 구하면되는 간단한 문제 
		//아....입력받은 M을 45기준으로 45보다 작으면 -1
		//아니면 입력받은 M에 -45
		//또한 H가 0보다 작아질 경우 H를 23d으로 수정 
		
		Scanner scanner = new Scanner(System.in);
		
		//조건을 걸고 
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		
		int mins = 45;
		
		
	
		
		//입력시간 24 
		//하루의 시작 0:0 끝 23:59 
		
		//24시간안에서 -45계산빼기 
		if(H >= 23 && M <= 59) {
//			System.out.println((H +":"+ M ) - mins);
		}else {
			System.out.println("shit");
		}
		
	}

}
