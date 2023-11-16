import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//sacks per wife, cats per sack, kittens per cat
		float n;

		while((n = Float.parseFloat(br.readLine()))>0){
			float sum = 0;
			for(int i = 0 ; i < 5 ; i++){
				sum += Math.pow(n,i);
			}
			String result = String.format("%.2f",sum);
			bw.write(result+"\n");
		}
		bw.close();
	}
}