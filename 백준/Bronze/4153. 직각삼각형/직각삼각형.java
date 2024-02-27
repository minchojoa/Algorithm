import java.io.*;
import java.util.*;

public class Main {
	static int factList[] = new int[10001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while(!(s = br.readLine()).equals("0 0 0")){
			StringTokenizer st = new StringTokenizer(s);
			int len[] = new int[3];
			for(int i = 0 ; i < 3 ; i++){
				len[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(len);
			if(Math.pow(len[0],2)+Math.pow(len[1],2)==Math.pow(len[2],2)){
				bw.write("right\n");
			}else{
				bw.write("wrong\n");
			}
		}
			bw.close();
	}
}