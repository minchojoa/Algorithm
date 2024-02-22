import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];
		int max = 0;
		
		for(int i = 0 ; i < N ; i++){
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);
		for(int i = 0 ; i < N ; i++){
			max = Math.max(max, rope[i]*(N-i));
		}
		bw.write(max+"");
		bw.close();
	}
}