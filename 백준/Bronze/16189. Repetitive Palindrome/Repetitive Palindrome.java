import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		long k = Long.parseLong(br.readLine());
		if(isPalindrome(s)){
			bw.write("YES");
		}else{
			bw.write("NO");
		}
		bw.close();
	}

	public static boolean isPalindrome(String s){
		boolean result = false;
		for(int i = 0 ; i < s.length()/2 ; i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}