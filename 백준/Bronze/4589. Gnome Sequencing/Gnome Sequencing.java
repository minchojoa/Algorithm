import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write("Gnomes:\n");
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());
            if(n1>=n2 && n2>=n3){
                bw.write("Ordered\n");
            }else if(n1<=n2 && n2<=n3){
                bw.write("Ordered\n");
            }else{
                bw.write("Unordered\n");
            }    
        }
        bw.close();
    }
}