import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for(int j = start ; j < end+1 ; j++){
				String number = String.valueOf(j);
				for(int k = 0 ; k < number.length() ; k++){
					if(number.charAt(k)=='0') cnt++;
				}
			}
				bw.write(cnt+"\n");
		}
		bw.close();
	}
}