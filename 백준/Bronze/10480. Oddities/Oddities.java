import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N ; i++){
            int num = Integer.parseInt(br.readLine());
            bw.write(num+" is ");
            if(num%2==0){
                bw.write("even");
            }else{
                bw.write("odd");
            }
            bw.newLine();
        }
        bw.close();
	}
}