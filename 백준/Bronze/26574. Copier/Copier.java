import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++){
			int temp = Integer.parseInt(br.readLine());
			bw.write(temp+" "+temp+"\n");
		}
		bw.close();
	}
}