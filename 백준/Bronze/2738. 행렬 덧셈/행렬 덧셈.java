import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int sum[][] = new int[N][M];
		for(int i = 0 ; i < N*2 ; i++){
			st = new StringTokenizer(br.readLine());
			if(i<N){
				for(int j = 0 ; j < M ; j++){
					int temp = Integer.parseInt(st.nextToken());
					sum[i][j] += temp;
				}
			}else{
				for(int j = 0 ; j < M ; j++){
					int temp = Integer.parseInt(st.nextToken());
					sum[i-N][j] += temp;
				}
			}
		}
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < M ; j++){
				bw.write(sum[i][j]+" ");
			}
			bw.write("\n");
		}
		bw.close();
	}
}