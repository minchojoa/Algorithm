import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		
		long xor = 0;
		long sum = 0;
		for(int i = 0 ; i < M ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int query = Integer.parseInt(st.nextToken());
			if(query==1){
				int x = Integer.parseInt(st.nextToken());
				sum += x;
				xor ^= x;
			}else if(query==2){
				int x = Integer.parseInt(st.nextToken());
				sum -= x;
				xor ^= x;
			}else if(query==3){
				bw.write(sum+"\n");
			}else{
				bw.write(xor+"\n");
			}
		}
		bw.close();
	}
}
