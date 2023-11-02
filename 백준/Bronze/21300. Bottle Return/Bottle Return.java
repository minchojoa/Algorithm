import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//empty containers of beer, malt, wine products, carbonated soft drinks, seltzer and water
		int result = 0;
		for(int i = 0 ; i < 6 ; i++){
			result += 5*Integer.parseInt(st.nextToken());
		}
		bw.write(result+"");
		bw.close();
	}
}