import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int A[][] = new int[N][M];

		Map<Integer, Integer> mR = new HashMap();
		Map<Integer, Integer> mC = new HashMap();

		for(int i = 0 ; i < Q ; i++){
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int rc = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			if(t==1){
				if(mR.containsKey(rc)){
					int temp = mR.get(rc);
					mR.replace(rc,temp+v);
				}else{
					mR.put(rc, v);
				}
			}else{
				if(mC.containsKey(rc)){
					int temp = mC.get(rc);
					mC.replace(rc,temp+v);
				}else{
					mC.put(rc, v);
				}
			}
		}

		for(int key : mR.keySet()){
			for(int i = 0 ; i < M ; i++){
				A[key-1][i] += mR.get(key);
			}
		}

		for(int key : mC.keySet()){
			for(int i = 0 ; i < N ; i++){
				A[i][key-1] += mC.get(key);
			}
		}

		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < M ; j++){
				bw.write(A[i][j]+" ");
			}
			bw.newLine();
		}	
		bw.close();
	}
}