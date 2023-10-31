import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String word[][] = new String[N][2];
		for(int i = 0 ; i < N ; i++){
			String temp = br.readLine();
			word[i][0] = String.valueOf(temp.length());
			word[i][1] = temp;
		}
		Arrays.sort(word, (w1, w2)->w1[0].equals(w2[0]) ? w1[1].compareTo(w2[1]):Integer.parseInt(w1[0])-Integer.parseInt(w2[0]));
		for(int i = 0 ; i < N ; i++){
			if(i==0 || i>0 && !word[i][1].equals(word[i-1][1])){
				bw.write(word[i][1]+"\n");
			}
		}
		bw.close();
	}
}