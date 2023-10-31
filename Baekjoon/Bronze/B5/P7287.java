import java.util.*;
import java.io.*;

public class P7287 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int bowl[] = new int[3];
		for(int i = 0 ; i < 3 ; i++){
			bowl[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(bowl);
		bw.write(bowl[1]+"");
		bw.close();
	}
}
