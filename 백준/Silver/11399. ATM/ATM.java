import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int time[] = new int[N];
		int result = 0;
		for(int i = 0 ; i < N ; i++){
			time[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(time);

		for(int i = 0 ; i < N ; i++){
			result += getTime(time, i, time[0]);
		}
		bw.write(result+"");
		bw.close();
	}

	public static int getTime(int[]time, int index, int sum){
		if(index==0){
			return sum;
		}else{
			sum += time[index];
			return getTime(time, index-1, sum);
		}
	}
}