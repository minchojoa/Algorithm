import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Quarter $0.25, Dime $0.10, Nickel $0.05, Penny $0.01
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i++){
			int temp = Integer.parseInt(br.readLine());
			getChange(temp, bw);
		}
		bw.close();
	}

	public static void getChange(int change, BufferedWriter bw) throws IOException{
		for(int i = 0 ; i < 4 ; i++){
			switch(i){
				case 0: bw.write(String.valueOf(change/25)+" "); change %= 25; break;
				case 1: bw.write(String.valueOf(change/10)+" "); change %= 10; break;
				case 2: bw.write(String.valueOf(change/5)+" "); change %= 5; break;
				case 3: bw.write(String.valueOf(change)+"\n");
			}
		}
	}
}