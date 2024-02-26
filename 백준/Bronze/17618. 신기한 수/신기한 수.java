import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		for(int i = 1 ; i < N+1 ; i++){
			String num = String.valueOf(i);
			int d = 0;
			for(int j = 0 ; j < num.length() ; j++){
				d += num.charAt(j)-'0';
			}
			if(i%d==0){
				cnt++;
			}
		}
		bw.write(cnt+"");
		bw.close();
	}
}