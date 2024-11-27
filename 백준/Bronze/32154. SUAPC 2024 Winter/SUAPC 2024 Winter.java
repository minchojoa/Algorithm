import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String score[][] = new String[10][2];
		
		score[0][0] = "11"; score[0][1] = "A B C D E F G H J L M";
		score[1][0] = "9"; score[1][1] = "A C E F G H I L M";
		score[2][0] = "9"; score[2][1] = "A C E F G H I L M";
		score[3][0] = "9"; score[3][1] = "A B C E F G H L M";
		score[4][0] = "8"; score[4][1] = "A C E F G H L M";
		score[5][0] = "8"; score[5][1] = "A C E F G H L M";
		score[6][0] = "8"; score[6][1] = "A C E F G H L M";
		score[7][0] = "8"; score[7][1] = "A C E F G H L M";
		score[8][0] = "8"; score[8][1] = "A C E F G H L M";
		score[9][0] = "8"; score[9][1] = "A B C F G H L M";
		
		int N = Integer.parseInt(br.readLine())-1;
		
		bw.write(score[N][0]);
		bw.newLine();
		bw.write(score[N][1]);
		bw.close();
	}
}