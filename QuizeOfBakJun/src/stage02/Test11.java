package stage02;

import java.util.Scanner;

import javafx.beans.binding.StringBinding;

public class Test11 {

	public static void main(String[] args) {
		
		
		//생각했던 식은 맞는데 디테일이 없었어유 신기하다 ...

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정할 개 수 : ");
		int n = sc.nextInt();
		System.out.println("기준점이 되는 수 : ");
		int x = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			
			int a = sc.nextInt();
			
			if(a < x) {
				System.out.print(a + " ");
			}
		}
		
		
		
		
		
	}

}
