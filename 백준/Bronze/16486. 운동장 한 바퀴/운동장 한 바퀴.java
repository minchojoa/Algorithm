import java.io.*;

public class Main {

	static boolean primeList[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int d1 = Integer.parseInt(br.readLine());
		int d2 = Integer.parseInt(br.readLine());
		double sum = d1*2 + 2*3.141592*d2;
		bw.write(sum+"");
		bw.close();
	}
}