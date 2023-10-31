import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int input = Integer.parseInt(br.readLine());
		
		s += input%60;
		input -= input%60;
		if(s>=60){
			m += s/60;
			s %= 60;
		}
		m += input/60;
		input %= 3600;
		if(m>=60){
			h += m/60;
			m %= 60;
		}
		h += input/3600;
		h %= 24;
		
		bw.write(h+" "+m+" "+s);
		bw.close();
	}
}