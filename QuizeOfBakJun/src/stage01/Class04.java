package stage01;

import java.util.Scanner;

public class Class04 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		//둘다 정수 
		if(x >= 0 && y >= 1) {
			System.out.println("Quadrant1");
			
		//x가 음수 	
		}else if(x <= -1 && y >= 1) {
			System.out.println("Quadrant2");
			
		}else if(x <= -1 && y <= -1) {
			System.out.println("Quadrant3");
			
		}else if(x >= 1 && y <= -1) {
			System.out.println("Quadrant4");
			
		}
	}

}
