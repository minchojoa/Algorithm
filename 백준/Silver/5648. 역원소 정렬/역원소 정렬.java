import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long num[] = new Long[n];

		for(int i = 0 ; i < n ; i++){
			long input = sc.nextLong();
			String temp = "";
			int len = String.valueOf(input).length();
			for(int j = 0 ; j < len ; j++){
				temp += String.valueOf(input%10);
				input /= 10;
			}
			num[i] = Long.parseLong(temp);
		}
		sc.close();
		Arrays.sort(num);
		for(Long i : num){
			bw.write(i+"\n");
		}
		bw.close();
	}
}