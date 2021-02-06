package stage04;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

	
		//과목개수 N
		//N개의 맞는 점수들 
		
		Scanner sc = new Scanner(System.in);
		
		int T  = sc.nextInt();
		int arr[] = new int[T];
		
		int max = 0;
		int sum = 0;
		
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				
				max = arr[i];
				
			}
			
			sum += arr[i];
			
		}

		System.out.println("최대값 : " + max);
		sc.close();
		
		avg = 100.0 * sum / max / T;
		System.out.println(avg);
		
	}

}














