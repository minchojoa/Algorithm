import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		Stack<Integer> num = new Stack<>();
		for(int i = 0 ; i < K ; i++){
			int temp = Integer.parseInt(br.readLine());
			if(temp==0){
				num.pop();
			}else{
				num.add(temp);
			}
		}
		while(!num.empty()){
			sum += num.pop();
		}
		bw.write(sum+"");
		bw.close();
	}
}