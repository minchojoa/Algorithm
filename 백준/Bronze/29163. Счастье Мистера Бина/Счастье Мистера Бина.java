import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		for(int i = 0 ; i < n ; i++){
			int a = Integer.parseInt(st.nextToken());
			if(a%2 == 0){
				result++;
			}else{
				result--;
			}
		}
		if(result>0){
			bw.write("Happy");
		}else{
			bw.write("Sad");
		}
		bw.close();
	}
}