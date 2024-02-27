import java.io.*;

public class Main {
	static int factList[] = new int[10001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int R = Integer.parseInt(br.readLine());
		double result = Math.pow(R,2)*Math.PI;
		double taxi = Math.pow(R, 2)*2;
		bw.write(String.format("%.6f",result)+"\n");
		bw.write(String.format("%.6f",taxi));
		bw.close();
	}
}