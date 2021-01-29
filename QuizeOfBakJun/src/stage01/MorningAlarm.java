package stage01;

import java.util.Scanner;

public class MorningAlarm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		int ansH = H;
		int ansM = M - 45;
		
		if(ansM < 0) {
			ansM += 60;
			
		}
		
		
	}

}
