import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long N = Long.parseLong(br.readLine());
		if(N%7==0||N%7==2){
			bw.write("CY");
		}else{
			bw.write("SK");
		}
		bw.close();
	}
}