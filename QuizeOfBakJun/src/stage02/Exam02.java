package stage02;

import java.util.Random;

public class Exam02 {

	public static void main(String[] args) {

		
		//두개의 주사위 던져 나오는 눈1,2형태로 출력하고 
		//2개의 눈의 합이 5가 아니면 계속 주사위를 던지고 5이면 stop 
		
		//while문과 random
		
			Random rd = new Random();
			
			int first;
			int second;
			int sum;
			
			
			
			first = (int)(Math.random()*6 + 1);
			second = (int)(Math.random()*6 + 1);
			
			
			do {
				
				 sum = first + second;
				
				System.out.println("눈1의 값은 : "+ first + " " +"눈2의 값은 : "+ second);
				System.out.println("합 : " + sum);
				break;
				
				
			}while(sum != 5);
			
	
		
		
		
		
		
	}

}
