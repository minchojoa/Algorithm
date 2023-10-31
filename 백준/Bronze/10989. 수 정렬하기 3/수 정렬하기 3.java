import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int num[] = new int[10000001];
		for(int i = 0 ; i < N ; i++){
			int temp = Integer.parseInt(br.readLine());
			num[temp]++;
		}
		for(int i = 0 ; i < 10000001 ; i++){
			while(num[i]>0){
				bw.write(i+"\n");
				num[i]--;
			}
		}
		bw.close();
	}
}