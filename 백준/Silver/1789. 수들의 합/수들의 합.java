import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Long.parseLong(br.readLine());
		long cnt = 1;
		long sum = 0;
		while(sum<=N){
			sum += cnt++;
		}
		if(sum==N){
			bw.write(cnt-3+"");
		}else{
			bw.write(cnt-2+"");
		}
		bw.close();
	}
}