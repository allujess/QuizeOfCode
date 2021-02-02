package stage04;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
								
	public static void main(String[] args) {

		//N개의 정수가 주어진다 이때 최솟값과 최댓값을 구하시오 
		//N개의 정수를 공백으로 구분해서 주어진다. 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		//int[n]만큼 해당 크기의 배열을 선언함 
		int [] arr = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			
		
			//6번 숫자를 집어넣음 
			arr[i] = sc.nextInt();
			
		}
		
		sc.close();
		//배열에 저장된 원소값을 오름차순으로 정렬해주는 메소드이다 
		Arrays.sort(arr);
		
		//그러므로 첫번째 원소(index 0) 최댓(arr.length-1)
		System.out.println(arr[0] + " " + arr[n-1]);
			
		
	}

}





