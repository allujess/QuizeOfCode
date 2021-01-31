package stage02;

public class Exam01 {

	public static void main(String[] args) {

		//중첩문	for문을 이용하여 방정식 
		//4x + 5y = 60 (x,y) 
		
		//x , y 는 10이하의 자연수 이여야함
		//고정되어있는 값 4하구 5이다 == 60
		
		for(int x = 1; x <= 10; x++) {
			
			for(int j = 1; j <= 10; j++) {
				
				//여기서 고정된 값이 4 , 5이고 연산이 60이되어양함 
				if((x*4)+(j*5)==60) {
					
					System.out.println(x +  " " + j);
					
				}
				
			}
		}
		
		
		

		
	}

}
