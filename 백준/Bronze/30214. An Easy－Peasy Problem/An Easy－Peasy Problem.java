import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		float b = Float.parseFloat(st.nextToken());

		if(a>=b/2){
			bw.write("E");
		}else{
			bw.write("H");
		}
		bw.close();
	}
}