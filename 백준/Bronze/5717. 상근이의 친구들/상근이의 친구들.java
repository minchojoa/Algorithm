import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while(!(s=br.readLine()).equals("0 0")){
            StringTokenizer st = new StringTokenizer(s);
            int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            bw.write(sum+"\n");
        }
        bw.close();
    }
}