import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long A = Long.parseLong(st.nextToken());
		Long B = Long.parseLong(st.nextToken());
		bw.write(LCM(A, B)+"");
		bw.close();
	}

	public static long GCD(long A, long B) {
		long temp;
		while(B % A != 0) {
			temp = B%A;
			B = A;
			A = temp;
		}
		return A;
	}
	
	public static long LCM(long A, long B) {
		return A * B / GCD(A, B);
	}
}