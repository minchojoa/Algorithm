import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = 1 ; i < N+1 ; i++){
			bw.write(i+" ");
			if(i%6==0) bw.write("Go! ");
			if(i==N&&i%6!=0) bw.write("Go!");
		}
		bw.close();
	}
}