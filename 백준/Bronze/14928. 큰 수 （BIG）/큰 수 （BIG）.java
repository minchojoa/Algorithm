import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
        long remain = 0;
        
        for (int i = 0; i < s.length(); i++) {
            remain = (remain * 10 + (s.charAt(i) - '0')) % 20000303;
        }
        
        bw.write(String.valueOf(remain));
        bw.close();
	}
}