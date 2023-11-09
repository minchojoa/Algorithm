import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;

		while((s=br.readLine())!=null){
			for(int i = 0 ; i < s.length() ; i++){
				if(s.charAt(i)=='i'){
					bw.write("e");
				}else if(s.charAt(i)=='e'){
					bw.write("i");
				}else if(s.charAt(i)=='I'){
					bw.write("E");
				}else if(s.charAt(i)=='E'){
					bw.write("I");
				}else{
					bw.write(s.charAt(i));
				}
			}
			bw.newLine();
		}
		bw.close();
	}
}