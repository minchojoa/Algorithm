import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());        

        if((V-A)%(A-B)==0){
            System.out.print((V-A)/(A-B)+1);
        }else{
            System.out.print((V-A)/(A-B)+2);
        }
	}
}