import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int cnt = 0;
		for(int i = 1 ; i < n+1 ; i++){
			int length = String.valueOf(i).length();
			for(int j = 0 ; j < length ; j++){
				if(Character.getNumericValue(String.valueOf(i).charAt(j)) == d){
					cnt++;
				}
			}
		}
		System.out.print(cnt);
	}
}