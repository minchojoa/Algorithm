import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		input = input.replaceAll("XXXX","AAAA");
		input = input.replaceAll("XX","BB");
		if(input.contains("X")){
			bw.write("-1");
		}else{
			bw.write(input);
		}
        bw.close();
	}
}