import java.util.*;

public class A0004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		int answer_from_0 = 1000000000;
		int answer_from_N = 1000000000;
		
		//집, 공유기 개수
		System.out.print("집(2~200000) >> ");
		int N = scan.nextInt();
		while(!(2<=N && N<=200000)){
			System.out.print("범위오류, 다시 입력 >> ");
			N = scan.nextInt();
		}
		System.out.print("공유기(2~"+N+") >> ");
		int C = scan.nextInt();
		while(!(2<=C && C<=N)){
			System.out.print("범위오류, 다시 입력 >> ");
			C = scan.nextInt();
		}

		//집 좌표
		System.out.println("범위: 0~1,000,000,000");
		System.out.println("집의 좌표 입력 >> ");
		int[] Nx = new int[N];
		for(int i = 0 ; i < N ; i++){
			Nx[i] = scan.nextInt();
			while(!(0<=Nx[i]&&Nx[i]<=1000000000)){
				System.out.print("범위오류, 다시 입력 >> ");
				Nx[i] = scan.nextInt();
			}
		}
		Arrays.sort(Nx);		
		

		// 집/공유기 = 공유기 설치거리 > 반올림 처리? 각 공유기 설치된 집간의 거리 비교
		//공유기 거리
		int distance = (int)Math.round((double)N/(double)C);
		for(int i = 0 ; i < C-1 ; i++){
			answer_from_0 = Math.min(answer_from_0, Nx[(i+1)*distance]-Nx[i*distance]);
			answer_from_N = Math.min(answer_from_N, Nx[(N-1)-(i*distance)]-Nx[(N-1)-((i+1)*distance)]);
		}
		answer = Math.max(answer_from_0, answer_from_N);
		System.out.print("answer: "+answer);
		// String[] strss

		/*
		입력 5 3 / 1 2 8 4 9
		출력 3
		*/


	}


}
