import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i = 0 ; i < 5 ; i++){
			int temp = Integer.parseInt(st.nextToken());
			sum += Math.pow(temp, 2);
		}
		System.out.print(sum%10+"");
	}
}
