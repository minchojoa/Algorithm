import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		Integer B[] = new Integer[N];

		for(int i = 0 ; i < 2 ; i ++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++){
				if(i==0){
					A[j] = Integer.parseInt(st.nextToken());
				}else{
					B[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		int S = 0;

		for(int i = 0 ; i < N ; i++){
			S += A[i]*B[i];
		}
		bw.write(S+"");
		bw.close();
	}
}