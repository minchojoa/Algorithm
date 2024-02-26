import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		bw.write(gcd(A, B)+"");
		bw.close();
	}

	public static int gcd(int A, int B) {
		int temp;
		while(B % A != 0) {
			temp = B%A;
			B = A;
			A = temp;
		}
		return A;
	}
}