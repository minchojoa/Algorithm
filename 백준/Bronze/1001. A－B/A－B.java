import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		while(check) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A-B);
			if(A>0&&B<10) {
				check = false;
			}
		}
	}//main
}