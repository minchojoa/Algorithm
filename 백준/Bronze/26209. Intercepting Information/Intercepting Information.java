import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean chk = true;
		for(int i = 0 ; i < 8 ; i++){
			int n = Integer.parseInt(st.nextToken());
			if(n!=0&&n!=1){
				chk = false;
			}
		}
		if(chk){
			bw.write("S");
		}else{
			bw.write("F");
		}
		bw.close();
	}
}