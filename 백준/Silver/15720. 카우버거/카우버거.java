import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		Integer[] burger = new Integer[B];
		Integer[] side = new Integer[C];
		Integer[] drink = new Integer[D];
		int set = Math.min(Math.min(B,C), D);
		int max = Math.max(Math.max(B, C), D);
		double maxPrice = 0;
		double minPrice = 0;


		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < B ; i++){
			burger[i] = Integer.parseInt(st.nextToken());
			maxPrice += burger[i];
		}

		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < C ; i++){
			side[i] = Integer.parseInt(st.nextToken());
			maxPrice += side[i];
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < D ; i++){
			drink[i] = Integer.parseInt(st.nextToken());
			maxPrice += drink[i];
		}
		Arrays.sort(burger, Collections.reverseOrder());
		Arrays.sort(side, Collections.reverseOrder());
		Arrays.sort(drink, Collections.reverseOrder());
		for(int i = 0 ; i < set ; i++){
			minPrice += (burger[i]+side[i]+drink[i])*0.9;
		}
		
		for(int i = set ; i < max ; i++){
			if(B>i){
				minPrice += burger[i];
			}
			if(C>i){
				minPrice += side[i];
			}
			if(D>i){
				minPrice += drink[i];
			}
		}

		bw.write((int)maxPrice+"\n"+(int)minPrice);
		bw.close();
	}
}