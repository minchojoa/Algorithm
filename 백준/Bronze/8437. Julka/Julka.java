import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		BigInteger c = a.add(b).divide(new BigInteger("2"));
		BigInteger d = c.subtract(b);
		/*
		BigInteger c = (a.divide(new BigInteger("2"))).add((b.divide(new BigInteger("2"))));
		BigInteger d = (a.divide(new BigInteger("2"))).subtract((b.divide(new BigInteger("2"))));
        a/2+b/2;
		a/2-b/2;
		*/
		bw.write(c+"\n"+d);
		bw.close();
	}
}