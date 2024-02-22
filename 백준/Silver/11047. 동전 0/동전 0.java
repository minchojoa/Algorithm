import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int coin[] = new int[N];
		int cnt = 0;

		for(int i = 0 ; i < N ; i++){
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0 ; i < N ; i++){
			int temp = coin[N-1-i];
			while(temp<=K){
				K -= temp;
				cnt++;
			}
		}
		bw.write(cnt+"");
		bw.close();
	}
}