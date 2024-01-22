import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			long b = Long.parseLong(st.nextToken());
			long a = Long.parseLong(st.nextToken());
			long lcm = lcm(a, b);
			bw.write(lcm+"\n");
		}
		bw.close();
	}

	public static long gcd (long num1, long num2){
		if(num1>=num2){
			if(num1%num2==0){
				return num2;
			}else{
				return gcd(num2, num1%num2);
			}
		}else{
			if(num2%num1==0){
				return num1;
			}else{
				return gcd(num1, num2%num1);
			}
		}
	}

	public static long lcm (long num1, long num2){
		long result = num1 * num2;
		result /= gcd(num1, num2);
		return result;
	}
}