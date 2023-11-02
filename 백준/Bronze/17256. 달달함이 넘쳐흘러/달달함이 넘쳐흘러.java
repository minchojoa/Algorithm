import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		a[2] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		c[0] = Integer.parseInt(st.nextToken());
		c[1] = Integer.parseInt(st.nextToken());
		c[2] = Integer.parseInt(st.nextToken());
		b[0] = c[0] - a[2];
		b[1] = c[1] / a[1];
		b[2] = c[2] - a[0];
		bw.write(b[0]+" "+b[1]+" "+b[2]);
		bw.close();
	}
}