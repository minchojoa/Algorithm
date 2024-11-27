import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		float x = Float.parseFloat(br.readLine());
		int N = (int)Math.floor(x);
		bw.write(N+"");
		bw.close();
	}
}