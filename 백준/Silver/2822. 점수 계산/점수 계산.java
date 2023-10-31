import java.io.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int score[][] = new int[8][2];
		for(int i = 0 ; i < 8 ; i++){
			score [i][0] = i+1;
			score [i][1] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(score, (n1, n2) -> n1[1] == n2[1] ? n1[0] - n2[0] : n1[1] - n2[1]);
		int no[] = new int[5];
		int sum = 0;
		for(int i = 7 ; i > 2 ; i--){
			sum += score[i][1];
			no[i-3] = score[i][0];
		}
		Arrays.sort(no);
		bw.write(sum+"\n");
		for(int i : no){
			bw.write(i+" ");
		}
		bw.close();
	}
}