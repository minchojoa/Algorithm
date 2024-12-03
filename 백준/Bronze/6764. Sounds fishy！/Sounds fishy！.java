import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		if(A<B) {
			if(B<C) {
				if(C<D) {
					bw.write("Fish Rising");					
				}else {
					bw.write("No Fish");
				}
			}else {
				bw.write("No Fish");
			}
		}else if(A>B){
			if(B>C) {
				if(C>D) {
					bw.write("Fish Diving");					
				}else {
					bw.write("No Fish");
				}
			}else {
				bw.write("No Fish");
			}
		}else if(A==B&&B==C&&C==D) {
			bw.write("Fish At Constant Depth");
		}else {			
			bw.write("No Fish");			
		}
		bw.close();
	}
}