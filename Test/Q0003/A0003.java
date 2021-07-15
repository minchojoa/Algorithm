import java.util.*;

public class A0003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0, D = 0, T = 0;
		Double Distance;
		Double answer;

		System.out.print("x >> ");
		x = scan.nextInt();
		System.out.print("y >> ");
		y = scan.nextInt();
		System.out.print("D >> ");
		D = scan.nextInt();
		System.out.print("T >> ");
		T = scan.nextInt();
		
		Distance = Math.sqrt((x*x)+(y*y));
		System.out.println("Distance: "+Distance);
		//D점프거리 >= Distance
		if(D > Distance){
			//점프-걷기 = 이동거리
			answer = Math.abs(Distance-D)+T;
		}else if(D == Distance){
			//점프 = 이동거리
			answer = (double)T;
		}else{
			//D점프거리 < Distance
			//점프+걷기, 점프2번, 걷기만
			answer = Math.min((Distance/D*T + Distance%D),2*T);
		}
		answer = Math.min(answer, Distance);
		System.out.println("최소소요시간 >> " + answer);
		
	}


}
