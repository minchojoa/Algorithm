import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		price(num1, num2, num3);
	}

	public static void price(int n1, int n2, int n3){
		int count = 0;
		int max = 0;
		int price = 0;
		boolean check = true;
		if(n1==n2){
			count ++;
			max = n1;
			check = false;
		}
		if(n1==n3){
			count ++;
			max = n1;
			check = false;
		}
		if(n2==n3){
			count ++;
			max = n2;
			check = false;
		}
		if(check){
			max = Math.max(Math.max(n1,n2),n3);
		}

		switch(count){
			case 0: {
				price = max*100;
				System.out.print(price);
			}
			break;
			case 1: {
				price = 1000+max*100;
				System.out.print(price);
			}
			break;
			case 3: {
				price = 10000+max*1000;
				System.out.print(price);
			}
			break;
		}
	}
}