import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		sum += 3*Integer.parseInt(br.readLine());
		sum += 4*Integer.parseInt(br.readLine());
		sum += 5*Integer.parseInt(br.readLine());
		bw.write(sum+"");
		bw.close();
	}
}