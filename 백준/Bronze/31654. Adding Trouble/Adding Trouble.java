import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int chk = Integer.parseInt(st.nextToken());
		chk += Integer.parseInt(st.nextToken());
		chk -= Integer.parseInt(st.nextToken());
		
		if(chk==0) {
			bw.write("correct!");
		}else {
			bw.write("wrong!");
		}		

		bw.close();
	}
}