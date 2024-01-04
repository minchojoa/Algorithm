import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int duration = scan.nextInt();
		scan.close();

		endTime(H, M, duration);		
	}

	public static void endTime(int H, int M, int duration){
		int time = (H*60+M)+duration;
		int Hour = time/60;
		int Minute = time%60;

		if(Hour>=24){
			Hour %= 24;
		}

		System.out.println(Hour+" "+Minute);
	}
}