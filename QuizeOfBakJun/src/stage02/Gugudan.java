package stage02;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		int hang ;
			
			for(hang = 1; hang <=9; hang++) {
				
				System.out.println(dan + "X" + hang + "=" + dan * hang);
				
			
			
		}
	}

}
