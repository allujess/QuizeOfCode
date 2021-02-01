package stage02;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test04{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int limit = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        
        for(int i=0; i<limit; i++) {
        	String line = br.readLine();
        	
        	StringTokenizer st = new StringTokenizer(line);
        	
        	a = Integer.parseInt(st.nextToken());
        	b = Integer.parseInt(st.nextToken());
        	
        	bw.write((a+b) + "\n");
        }

        br.close();
        // 버퍼의 나머지 값들을 비워줌
        bw.flush();
        bw.close();
    }
}