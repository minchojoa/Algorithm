import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			double d = Double.parseDouble(st.nextToken()); // 개 마릿수
			double f = Double.parseDouble(st.nextToken()); // 개 당 음식 양
			double p = Double.parseDouble(st.nextToken()); // 개 당 음식 가격
			double sum = d*f*p;
			//double sum = Math.round(d*f*p*100)/100.0;
			bw.write("$"+String.format("%.2f",sum)+"\n");
		}
		bw.close();
	}
}