import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0 ; i < 3 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken())*3600;
            int m1 = Integer.parseInt(st.nextToken())*60;
            int s1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken())*3600;
            int m2 = Integer.parseInt(st.nextToken())*60;
            int s2 = Integer.parseInt(st.nextToken());
            int time = h2+m2+s2 - (h1+m1+s1);
            bw.write(time/3600+" ");
            time%=3600;
            bw.write(time/60+" "+time%60);
            bw.newLine();
        }
        bw.close();
    }
}