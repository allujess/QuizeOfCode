package stage04;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("테스트 케이스 숫자를 입력해주세요 : ");
		
		int t = sc.nextInt();
		int index = 0; 
		
		int[] arr = new int [t];
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
			index = i + 1;
			
			
		}
		
		Arrays.sort(arr);
		
	//	System.out.println(arr.length - 1);
		
		//arr.length - 1 이 최댓값일꺼임 
		System.out.println(arr[t-1]);
		
		System.out.println(index);
		
		
	

	}

}





