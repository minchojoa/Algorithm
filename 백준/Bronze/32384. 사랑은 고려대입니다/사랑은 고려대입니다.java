import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String s = "LoveisKoreaUniversity ";
		for(int i = 0 ; i < N ; i++) {
			bw.write(s);
		}
		bw.close();
	}
}