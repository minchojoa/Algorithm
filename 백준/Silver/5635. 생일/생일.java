import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Map<Integer, String> person = new HashMap();
		int min = 0;
		int max = 0;
		for(int i = 0 ; i < n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int d = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int calc = d+(m-1)*30+y*365;
			if(i==0){
				min = calc;
				max = calc;
			}
			if(calc<min){
				min = calc;
			}
			if(calc>max){
				max = calc;
			}
			person.put(calc, name);
		}
		List<Integer> sort = new ArrayList<>(person.keySet());
		Collections.sort(sort);
		bw.write(person.get(max));
		bw.newLine();
		bw.write(person.get(min));
		bw.close();
	}
}