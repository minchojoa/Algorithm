import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int start = 11*1440 + 11*60 + 11;
		int end = D*1440 + H*60 + M; 
		
		if(start>end) {
			bw.write("-1");
		}else {
			bw.write(end-start+"");
		}
		
		bw.close();
	}
}