import java.io.*;
import java.util.*;

public class Main {

	static boolean primeList[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		primeList = new boolean[N+2];
		isPrime(N);
		for(int i = M ; i < N+1 ; i++){
			if(!primeList[i]){
				bw.write(i+"\n");
			}
		}
		bw.close();
	}

	public static void isPrime(int N){
		primeList[0] = true;
		primeList[1] = true;

		for(int i = 2 ; i*i <= N ; i++){
			if(!primeList[i]){
				for(int j = i*i ; j <= N ; j+=i){
					primeList[j] = true;
				}
			}
		}
	}
}
