import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = 1 ; i < 2*N ; i++){
			if(i<=N){
				for(int j = 0 ; j < N-i ; j++){
					bw.write(" ");
				}
				for(int j = 0 ; j < i*2-1; j++){
					bw.write("*");
				}
				if(i==(2*N-1)){
				}else{
					bw.write("\n");
				}
			}else{
				for(int j = i-N ; j > 0 ; j--){
					bw.write(" ");
				}
				for(int j = (2*N)-((i-N)*2+1) ; j > 0 ; j--){
					bw.write("*");
				}
				if(i==(2*N-1)){
				}else{
					bw.write("\n");
				}
			}
		}
		bw.close();
	}	
}