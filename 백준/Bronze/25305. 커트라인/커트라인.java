import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] x = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++){
			x[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(x);
		System.out.print(x[N-k]);
	}
}