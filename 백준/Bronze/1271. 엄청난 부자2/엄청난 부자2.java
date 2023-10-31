import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		BigInteger money = n.divide(m);
		BigInteger remain = n.remainder(m);
		bw.write(money+"\n"+remain);
		bw.close();
	}
}