import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = N ; i > 3 ; i--){
			String num = String.valueOf(i);
			boolean check = true;
			for(int j = 0 ; j < num.length() ; j++){
				if(!(num.charAt(j)=='4'||num.charAt(j)=='7')){
					check = false;
				}
			}
			if(check){
				bw.write(i+"");
				break;
			}
		}
		bw.close();
	}
}