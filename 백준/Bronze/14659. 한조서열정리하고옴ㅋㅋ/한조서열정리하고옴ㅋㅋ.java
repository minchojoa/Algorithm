import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int m[] = new int[N];
		int killCount[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++){
			m[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0 ; i < N-1 ; i++){
			int cnt = 0;
			for(int j = i+1 ; j < N ; j++){
				if(m[i]>m[j]){
					cnt++;
					if(j==N-1){
						killCount[i] = cnt;
					}
				}else{
					killCount[i] = cnt;
					break;
				}
			}
		}
		Arrays.sort(killCount);
		
		bw.write(killCount[N-1]+"");
		bw.close();
	}
}