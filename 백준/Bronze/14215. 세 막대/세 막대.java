import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tri[] = new int[3];
		tri[0] = Integer.parseInt(st.nextToken());
		tri[1] = Integer.parseInt(st.nextToken());
		tri[2] = Integer.parseInt(st.nextToken());
		Arrays.sort(tri);
		int ans = 0;
		if(tri[0]+tri[1]>tri[2]){
			ans = tri[0] + tri[1] + tri[2];
		}else{
			ans = (tri[0]+tri[1])*2 - 1;
		}
		System.out.print(ans);
	}
}