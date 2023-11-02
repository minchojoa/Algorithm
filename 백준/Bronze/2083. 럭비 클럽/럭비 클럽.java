import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;

		while(!(s=br.readLine()).equals("# 0 0")){
			StringTokenizer st = new StringTokenizer(s);
			bw.write(st.nextToken()+" ");
			int age = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			if( age>17 || weight>=80){
				bw.write("Senior\n");
			}else{
				bw.write("Junior\n");
			}
		}
		bw.close();
	}
}