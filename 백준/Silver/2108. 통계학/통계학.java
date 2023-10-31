import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int count[] = new int[8001];
		int sum = 0;
		int max = 0;
		int min = 0;
		
		for(int i = 0 ; i < N ; i++){
			int temp = Integer.parseInt(br.readLine());
			sum += temp;
			if(i==0){
				max = temp;
				min = temp;
			}else{
				max = Math.max(max,temp);
				min = Math.min(min,temp);
			}
			count[temp+4000]++;
		}
		int cnt = 0;
		int cntMax = 0;
		int isSec = 0;
		int n1 = Math.round(sum/(float)N);
		int n2 = 4001;
		int n3 = 4001;
		int n4 = max-min;
		for(int i = 0 ; i < 8001 ; i++){
			if(count[i]!=0){
				cnt+=count[i];
				if(cnt>=(N/2)+1&&n2==4001){
					n2 = i-4000;
				}

				if(cntMax<count[i]){
					isSec = 0;
					cntMax = count[i];
					n3 = i-4000;
				}else if(cntMax==count[i]){
					isSec++;
					if(isSec==1){
						n3 = i-4000;
					}
				}
			}
		}
		bw.write(n1+"\n"+n2+"\n"+n3+"\n"+n4);
		bw.close();
	}
}