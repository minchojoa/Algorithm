import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int ant = Integer.parseInt(br.readLine());
		int eye = Integer.parseInt(br.readLine());
		
		if(ant>=3 && eye<=4) {
			bw.write("TroyMartian\n");
		}
		if(ant<=6 && eye>=2) {
			bw.write("VladSaturnian\n");
		}
		if(ant<=2 && eye<=3) {
			bw.write("GraemeMercurian\n");
		}
		bw.close();
	}
}