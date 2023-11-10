import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int h2s = Integer.parseInt(br.readLine());
        int s2p = Integer.parseInt(br.readLine());
        int p2h = Integer.parseInt(br.readLine());
        int h2h = Integer.parseInt(br.readLine());
        int time = h2s + s2p + p2h + h2h;
        int m = time/60;
        int s = time%60;
        bw.write(m+"\n"+s);
        bw.close();
    }
}