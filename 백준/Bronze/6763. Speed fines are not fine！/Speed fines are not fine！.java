import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int limitSpeed = Integer.parseInt(br.readLine());
        int recordedSpeed = Integer.parseInt(br.readLine());
        int speedOver = recordedSpeed - limitSpeed;

        if(speedOver>=1 && speedOver <=20){
            bw.write("You are speeding and your fine is $100.");
        }else if(speedOver>=21 && speedOver<=30){
            bw.write("You are speeding and your fine is $270.");
        }else if(speedOver>=31){
            bw.write("You are speeding and your fine is $500.");
        }else
            bw.write("Congratulations, you are within the speed limit!");
        bw.close();
    }
}