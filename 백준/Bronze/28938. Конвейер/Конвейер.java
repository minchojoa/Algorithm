import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		for(int i = 0 ; i < n ; i++){
			result += Integer.parseInt(st.nextToken());
		}
		if(result>0){
			bw.write("Right");
		}else if(result<0){
			bw.write("Left");
		}else{
			bw.write("Stay");
		}
		bw.close();
	}
}