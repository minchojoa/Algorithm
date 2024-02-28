import java.io.*;

public class Main {
	static int primeList[] = new int[10000002]; // 0: 초기화 1: 소수o 2: 소수x
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N ; i++){
			bw.write("a");
		}		
		bw.close();
	}
}