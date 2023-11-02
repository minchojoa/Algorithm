import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		int cntVowel = 0;
		for(int i = 0 ; i < N ; i++){
			if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i'
			|| S.charAt(i) == 'o' || S.charAt(i) == 'u'){
				cntVowel++;
			}
		}
		System.out.print(cntVowel);
	}
}