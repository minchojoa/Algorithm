import java.io.*;
import java.util.*;

public class Main {
	static int factList[] = new int[10001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		int max = 0;
		for(int i = 0 ; i < B.length()-A.length()+1 ; i++){
			int cnt = 0;
			for(int j = 0 ; j < A.length() ; j++){
				if(A.charAt(j)==B.charAt(j+i)){
					cnt++;
				}
			}
			max = Math.max(max,cnt);
		}
		bw.write((A.length()-max)+"");
		bw.close();
	}
}