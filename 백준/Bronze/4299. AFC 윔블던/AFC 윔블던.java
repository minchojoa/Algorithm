import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken());
		int sub = Integer.parseInt(st.nextToken());
		int a = (sum+sub)/2;
		int b = sum-a;
		if((sum+sub)%2==1||sum<sub){
			bw.write("-1");
		}else{
			bw.write(a+" "+b);
		}
		bw.close();
	}
}