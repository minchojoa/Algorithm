import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		// 2, 3, 4, 5 > 60
		for(int i = X ; i <= Y ; i+=60){
			bw.write("All positions change in year "+i+"\n");
		}
		bw.close();
	}
}