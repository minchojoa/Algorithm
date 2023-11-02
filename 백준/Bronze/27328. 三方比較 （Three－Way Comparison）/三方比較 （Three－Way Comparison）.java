import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		if(A<B){
			bw.write("-1");
		}else if(A==B){
			bw.write("0");
		}else{
			bw.write("1");
		}
		bw.close();
	}
}