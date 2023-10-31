import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[3];

		for(int i = 0 ; i < 3 ; i++){
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		for(int i = 0 ; i < 3 ; i++){
			bw.write(num[i]+" ");
		}
		bw.close();
	}
}