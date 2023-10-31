import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int length = String.valueOf(N).length();
		int num[] = new int[length];

		for(int i = 0 ; i < length ; i++){
			num[i] = Character.getNumericValue(String.valueOf(N).charAt(i));
		}
		Arrays.sort(num);

		for(int i = length-1 ; i >= 0 ; i--){
			bw.write(num[i]+"");
		}
		bw.close();
	}
}