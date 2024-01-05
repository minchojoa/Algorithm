import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		if(n>=620){
			bw.write("Red");
		}else if(n>=590){
			bw.write("Orange");
		}else if(n>=570){
			bw.write("Yellow");
		}else if(n>=495){
			bw.write("Green");
		}else if(n>=450){
			bw.write("Blue");
		}else if(n>=425){
			bw.write("Indigo");
		}else{
			bw.write("Violet");
		}
		bw.close();
	}
}