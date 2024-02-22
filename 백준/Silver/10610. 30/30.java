import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		int len = N.length();
		int sum = 0;
		boolean zero = false;
		Integer num[] = new Integer[len];

		for(int i = 0 ; i < len ; i++){
			num[i] = N.charAt(i)-'0';
			sum += num[i];
			if(num[i]==0){
				zero = true;
			}
		}

		if(sum%3==0 && zero){
			Arrays.sort(num, Collections.reverseOrder());
			for(int n : num){
				bw.write(n+"");
			}
		}else{
			bw.write("-1");
		}
		bw.close();
	}
}