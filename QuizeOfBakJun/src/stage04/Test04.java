package stage04;

import java.util.HashSet;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Test04 {

	public static void main(String[] args) {

		//서로 다른개수를 세면 되는것 
		//HashSet을이용하면 자연스럽게 나머지값이 HashSet원소에 이미 저장되어 
		//중복일경우 저장이 되지않고 HashSet에 없으면 저장한다 
		//HashSet에 저장하면서 들어가는 원소의 개수가 HashSet의 사이즈가되고 
		//->서로다른 나머지가 된다 .
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print("10번 숫자를 입력하세요 : ");
			
			//.add지정된요소를 집합에 추가 
			h.add(sc.nextInt() % 42);
			//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
			
		}
		sc.close();
		System.out.println(h.size());
		
		
		
	}

}
