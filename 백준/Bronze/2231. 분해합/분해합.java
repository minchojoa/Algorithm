import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N ; i++){
			int num = i;
			int sum = i;
			int length = String.valueOf(i).length();
			for(int j = 0 ; j < length ; j++){
				sum += num%10;
				num /= 10;
			}
			if(sum==N){
				System.out.print(i);
				return;
			}
		}
		System.out.print("0");
	}
}