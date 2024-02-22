import java.io.*;
import java.util.*;

public class Main {
	static int time[]; 
	static int memo[]; 
	public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean numList[] = new boolean[100001];
		for(int i = 1 ; i < 10001 ; i++){
			numList[checkNum(i)] = true;
		}
		for(int i = 1 ; i < 10001 ; i++){
			if(!numList[i]){
				bw.write(i+"\n");
			}
		}
		bw.close();
	}
	
	public static int checkNum(int num){
		int sum = num; 
		while(num!=0){
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
}