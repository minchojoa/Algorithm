import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		if(w >= a*v) {
			bw.write("1");
		}else {
			bw.write("0");
		}
		bw.close();
	}
}