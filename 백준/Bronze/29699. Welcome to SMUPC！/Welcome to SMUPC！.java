import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String label = "WelcomeToSMUPCW";
		int N = Integer.parseInt(br.readLine())-1;
		int index = N%14;
		bw.write(label.charAt(index));
		bw.close();
	}
}