import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int marble[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = 0;
		for(int i = 0 ; i < N ; i++){
			marble[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(marble);
		for(int i = 0 ; i < N-1 ; i++){
			length += marble[i+1]-marble[i];
		}
		length += marble[N-1]-marble[0];
		bw.write(length+"");
		bw.close();
	}
}