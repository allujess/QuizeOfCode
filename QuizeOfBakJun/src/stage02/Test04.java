package stage02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test04 {
	//병근오빠 
	//StringTokenizer 
	//
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i = 0; i < n; i++) {
			String text = br.readLine();
			
			//Split
			String[] word = text.split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a+b) + "\n");
			
		}
		
		bw.flush();  //뽑아주는거 
		
		//그냥 닫기 
		bw.close();
		
		
		
	}

}
