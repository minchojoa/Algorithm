import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		float X;

		while((X=Float.parseFloat(br.readLine()))>=0){
			double Y = X*0.167;
			String resultX = String.format("%.2f", X);
			String resultY = String.format("%.2f", Y);
			bw.write("Objects weighing "+resultX+" on Earth will weigh "+resultY+" on the moon.\n");
		}
		bw.close();
	}
}