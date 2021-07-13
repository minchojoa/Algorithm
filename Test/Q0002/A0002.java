import java.util.*;

public class A0002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input[] = new int[5];
		int sum = 0;

		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.print((i+1)+"번째 수: ");
			input[i] = scan.nextInt();
			sum += (input[i]*input[i]);
		}

		System.out.println("검증 수: "+(sum%10));

	}

}
