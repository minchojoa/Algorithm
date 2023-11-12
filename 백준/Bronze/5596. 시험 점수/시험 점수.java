import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Min = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Man = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        int result = Math.max(Min, Man);
        bw.write(result+"");
        bw.close();
    }
}