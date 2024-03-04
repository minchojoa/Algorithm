import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		boolean chk = true;
		boolean chk2 = true;
		int o = 1;
		int p = 0;
		while(chk){
			chk2 = true;
			p = 0;
			while(chk2){
				Double num = o*Math.pow(2, p);
				if(num>n){
					chk2 = false;
					break;
				}else if(num==n){
					chk = false;
					break;
				}
				p++;
			}
			if(!chk){
				break;
			}
			o+=2;
		}
		bw.write(o+" "+p);
		bw.close();
	}
}
