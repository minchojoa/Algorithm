import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 3;
		sum += Integer.parseInt(br.readLine());
		sum += Integer.parseInt(br.readLine());  
        bw.write(sum+"");
		bw.close();
	}
}