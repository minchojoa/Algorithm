import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;

		while(!(s=br.readLine()).equals("#")){
			int cnt = 0;
			for(int i = 0 ; i < s.length() ; i++){
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
				|| s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'
				|| s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
				 || s.charAt(i) == 'U'){
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		bw.close();
	}
}