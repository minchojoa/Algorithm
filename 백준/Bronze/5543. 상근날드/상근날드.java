import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int burger1 = scan.nextInt();
		int burger2 = scan.nextInt();
		int burger3 = scan.nextInt();
		
		int beverage1 = scan.nextInt();
		int beverage2 = scan.nextInt();
		
		//Math.min(burger1, burger2, burger3);
		int result = minBurger(burger1, burger2, burger3)+Math.min(beverage1, beverage2)-50;
		System.out.println(result);
	}
	
	public static int minBurger(int burger1, int burger2, int burger3) {
		int b1b2 = Math.min(burger1, burger2);
		int b1b3 = Math.min(burger1, burger3);
		int result = Math.min(b1b2, b1b3);
		return result;
	}

}