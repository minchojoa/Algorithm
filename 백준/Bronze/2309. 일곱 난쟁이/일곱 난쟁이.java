import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] num = new int[9];
		int sum = -100;
		int fake1 = 0;
		int fake2 = 0;

		for(int i = 0 ; i < 9 ; i++){
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		Arrays.sort(num);
		for(int i = 0 ; i < 8 ; i++){
			for(int j = i+1 ; j < 9 ; j++){
				int check = num[i] + num[j];
				if(check==sum){
					fake1 = i;
					fake2 = j;
					break;
				}
			}
		}
		for(int i = 0 ; i < 9 ; i++){
			if(i!=fake1 && i!=fake2){
				bw.write(num[i]+"\n");
			}
		}
		bw.close();
	}
}