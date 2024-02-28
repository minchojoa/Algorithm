import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		//remain>> 2: odd 3: either 0:even 1:either
		//print even: 2 / odd: 1 / either: 0
		int remain = n%4;
		switch (remain){
			case 0: bw.write("2"); break;
			case 1: bw.write("0"); break;
			case 2: bw.write("1"); break;
			case 3: bw.write("0"); break;
		}
		bw.close();
	}
}