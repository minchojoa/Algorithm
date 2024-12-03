import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Sab = Integer.parseInt(br.readLine());
		int Fab = Integer.parseInt(br.readLine());
		
        if(Sab<=Fab) {
            bw.write("high speed rail");				
        }else {
            bw.write("flight");				
        }

		bw.close();
	}
}