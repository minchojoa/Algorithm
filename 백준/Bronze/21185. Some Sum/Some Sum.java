import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int s = N%4;
		switch(s){
			case 1: bw.write("Either"); break;
			case 2: bw.write("Odd"); break;
			case 3: bw.write("Either"); break;
			case 0: bw.write("Even"); break;
		}
		bw.close();
	}
}