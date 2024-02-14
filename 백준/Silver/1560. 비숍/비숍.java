import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger N = new BigInteger(br.readLine());
		BigInteger N2 = new BigInteger("2");
		int cmp = N.compareTo(N2); // N이 2보다 작으면 -1 같으면 0 크면 1
		if(cmp<1){
			bw.write(N+"");
		}else{
			BigInteger result = N.add(N.subtract(N2));
			bw.write(result+"");
		}
		bw.close();
	}
}