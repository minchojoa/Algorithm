import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int pic[][] = new int[101][101];
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;
		for(int i = 0 ; i < N ; i++){
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int j = x1 ; j < x2+1 ; j++){
				for(int k = y1 ; k < y2+1 ; k++){
					pic[j][k]++;
				}
			}
		}
		for(int i = 0 ; i < 101 ; i++){
			for(int j = 0 ; j < 101 ; j++){
				if(pic[i][j]>M){
					cnt++;
				}
			}
		}
		bw.write(cnt+"");
        bw.close();
	}
}