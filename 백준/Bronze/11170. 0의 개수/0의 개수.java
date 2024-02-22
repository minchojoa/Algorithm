import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for(int j = start ; j < end+1 ; j++){
				int temp = j;
				if(temp==0){
					cnt++;
					continue;
				}
				while(temp>0){
					if(temp%10==0){
						cnt++;
					}
					temp/=10;
				}
			}
				bw.write(cnt+"\n");
		}
		bw.close();
	}
}