import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int L = Integer.parseInt(br.readLine());
		float A = Float.parseFloat(br.readLine());
		float B = Float.parseFloat(br.readLine());
		float C = Float.parseFloat(br.readLine());
		float D = Float.parseFloat(br.readLine());
		
		int lang = (int)Math.ceil(A/C);
		int math = (int)Math.ceil(B/D);
		
		int result = L - Math.max(lang, math);
		
		bw.write(result+"");
		bw.close();
	}
}