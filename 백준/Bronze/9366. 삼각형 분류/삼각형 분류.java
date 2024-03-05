import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int size[] = new int[3];
			size[0] = Integer.parseInt(st.nextToken());
			size[1] = Integer.parseInt(st.nextToken());
			size[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(size);
			bw.write("Case #"+(i+1)+": ");
			if(size[0]+size[1]<=size[2]){
				bw.write("invalid!\n");
			}else if(size[0]==size[1]&&size[0]==size[2]){
				bw.write("equilateral\n");
			}else if(size[0]==size[1]||size[1]==size[2]||size[0]==size[2]){
				bw.write("isosceles\n");
			}else{
				bw.write("scalene\n");
			}
		}
		bw.close();
	}
}