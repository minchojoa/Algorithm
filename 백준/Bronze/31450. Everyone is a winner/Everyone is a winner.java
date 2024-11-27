import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        if(M%K==0) {
        	bw.write("Yes");
        }else{
        	bw.write("No");
        }
		bw.close();
	}
}