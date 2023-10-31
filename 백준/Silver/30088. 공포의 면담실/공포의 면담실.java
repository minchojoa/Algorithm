import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BigInteger time[] = new BigInteger[N];
		BigInteger result = new BigInteger("0");
		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int person = Integer.parseInt(st.nextToken());
			for(int j = 0 ; j < person ; j++){
				if(time[i] == null){
					time[i] = new BigInteger("0");
				}
				time[i] = time[i].add(new BigInteger(st.nextToken()));
			}
		}
		Arrays.sort(time);
		for(int i = 0 ; i < N ; i++){
			BigInteger a = new BigInteger(String.valueOf(N-i));
			BigInteger b = a.multiply(time[i]);
			result = result.add(b);
		}
		System.out.print(result);
	}
}