import java.io.*;

public class Main {
	static int primeList[] = new int[2000000]; // 0: 초기화 1: 소수o 2: 소수x
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		boolean chk = false;

		while(!chk){
			String num = String.valueOf(N);
			if(isPalindrome(N, num)||N<10){
				if(isPrime(N, num)){
					chk=true;
				}
			}
			N++;
		}
		
		bw.write((N-1)+"");
		bw.close();
	}

	public static boolean isPalindrome(int N, String num){
		boolean result = false;
		if(N%2==0){
			for(int i = 0 ; i < num.length()/2-1 ; i++){
				if(num.charAt(i)==num.charAt(num.length()-1-i)){
					result = true;
				}else{
					result = false;
					break;
				}
			}
		}else{
			for(int i = 0 ; i < num.length()/2 ; i++){
				if(num.charAt(i)==num.charAt(num.length()-1-i)){
					result = true;
				}else{
					result = false;
					break;
				}
			}
		}
		return result;
	}

	public static boolean isPrime(int N, String num){
		boolean result = false;
		if(N==2){
			primeList[2] = 1;
			return true;
		}
		if(primeList[N]!=0){
			if(primeList[N]==1){
				result = true;
			}else{
				result = false;
			}
		}else{
			for(int i = 2 ; i < N ; i++){
				
				if(N%i==0){
					primeList[i] = 2;
					result = false;
					break;
				}else{
					primeList[i] = 1;
					result = true;
				}
			}
		}
		return result;
	}
}