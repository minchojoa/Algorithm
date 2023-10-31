import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input[] = scan.nextLine().split(" ");
		scan.close();

		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);

		if(A>B){
			System.out.println(">");
		}else if(A<B){
			System.out.println("<");
		}else{
			System.out.println("==");
		}
	}
}