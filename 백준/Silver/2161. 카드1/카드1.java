import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();

		for(int i = 1 ; i < N+1 ; i++){
			q.offer(i);
		}
		for(int i = 0 ; i < N ; i++){
			bw.write(q.poll()+" ");
			q.offer(q.poll());
		}
		bw.close();
	}
}