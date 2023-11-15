import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalScore = 0;
        for(int i = 0 ; i < 5 ; i++){
            int score = Integer.parseInt(br.readLine());
            if(score<40){
                totalScore += 40;
            }else{
                totalScore += score;
            }
        }
        int result = totalScore / 5;
        bw.write(result+"");
        bw.close();
    }
}