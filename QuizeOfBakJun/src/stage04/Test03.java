package stage04;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {


		//숫자의 개수 
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextByte() * sc.nextInt());
		
		String str = Integer.toString(value);
		System.out.println("결과값 : " +  str);
		
		sc.close();
		
		//0에서 9까지 
		for(int i = 0; i < 10; i++) {
			
			//카운트를 0으로 초기화하여 
			int count = 0; 
			
			for(int j = 0; j < str.length(); j++) {
			
				//이중for문을 통해 str의 길이만큼 요소를 charAt()을 통해 
				//해당 인덱스의 문자와 i 가 같은 수가 몇개인지보고 맞으면 count + 1을 시킴 
				
				if((str.charAt(j) - '0') == i ) {
					count ++;
					
				}
				
				
			}
			
			System.out.println(count);
		}
		
		
	}

}




