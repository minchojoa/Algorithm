import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int cnt[] = new int[26];
		boolean check = true;
		//A65 Z90 a97 z122 (-32)
		for(int i = 0 ; i < word.length() ; i++){
			char tmp = word.charAt(i);
			if(tmp<=90){
				cnt[tmp-65]++;
			}else{
				cnt[tmp-97]++;
			}
		}
		int comp = 0;
		int ans = 0;
		for(int i = 0 ; i < 26 ; i++){
			if(comp < cnt[i]){
				comp = Math.max(comp, cnt[i]);
				ans = i;
				check = true;
			}else if(comp == cnt[i] && comp != 0){
				check = false;
			}
		}
		if(check){
			System.out.print((char)(ans+65));
		}else{
			System.out.print("?");
		}
	}
}