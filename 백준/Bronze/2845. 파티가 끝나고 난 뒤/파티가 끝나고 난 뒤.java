import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int LP = L*P;
		st = new StringTokenizer(br.readLine());

		for(int i = 0 ; i < 5 ; i++ ){
			int n = Integer.parseInt(st.nextToken());
			int result = n-LP;
			bw.write(result+" ");
		}

		bw.close();
	}
}