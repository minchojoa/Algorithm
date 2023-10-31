import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int time[] = new int[N];
		int result = 0;
		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int person = Integer.parseInt(st.nextToken());
			for(int j = 0 ; j < person ; j++){
				time[i] += Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(time);
		for(int i = 0 ; i < N ; i++){
			result += (N-i)*time[i];
		}
		System.out.print(result);
	}

}