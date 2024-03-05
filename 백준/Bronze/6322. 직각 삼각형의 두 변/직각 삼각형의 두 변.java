import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		int index = 1;

		while(!(input=br.readLine()).equals("0 0 0")){
			StringTokenizer st = new StringTokenizer(input);
			String s;
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==-1){
				s = "a";
			}else if(b==-1){
				s = "b";
			}else{
				s = "c";
			}
			bw.write("Triangle #"+index+"\n");
			if(triangleAble(a, b, c)){
				bw.write(s+" = "+String.format("%.3f",getSize(a, b, c))+"\n\n");
			}else{
				bw.write("Impossible.\n\n");
			}
			index++;
		}
		bw.write("");
		bw.close();
	}

	static boolean triangleAble(int a, int b, int c){
		boolean result;
		if(c==-1){
			result = true;
		}else if(c<=a||c<=b){
			result = false;
		}else{
			result = true;
		}
		return result;
	}

	static double getSize(int a, int b, int c){
		double result;
		if(a==-1){
			result = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
		}else if(b==-1){
			result = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
		}else{
			result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		}
		return result;
	}

}