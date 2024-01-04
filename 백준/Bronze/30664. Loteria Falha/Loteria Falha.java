import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while(!(s = br.readLine()).equals("0")){
			BigInteger n = new BigInteger(s);
			BigInteger r = new BigInteger("42");
			int re = (n.remainder(r)).intValue();
			if(re==0){
				bw.write("PREMIADO\n");
			}else{
				bw.write("TENTE NOVAMENTE\n");
			}
		}
		bw.close();
	}
}