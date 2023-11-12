import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int result = 2*M-Y;
		bw.write(result+"");
		bw.close();
	}
}