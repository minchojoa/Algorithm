import java.io.*;
import java.util.*;

public class Main {
	static int time[]; 
	static int memo[]; 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		time = new int[N];
		memo = new int[N];
		int result = 0;
		for(int i = 0 ; i < N ; i++){
			time[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time);
		for(int i = 0 ; i < N ; i++){
			result += getTime(i);
		}
		bw.write(result+"");
		bw.close();
	}
	
	public static int getTime(int index){
		if(memo[index]>0){
			return memo[index];
		}
		
		if(index==0){
			memo[index] = time[0];
			return memo[index];
		}else if(index==1){
			memo[index] = memo[index-1] + time[index];
			return memo[index];
		}else{
			memo[index] = getTime(index-1) + time[index];
			return memo[index];
		}
	}
}