import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String find = br.readLine();
		int N = Integer.parseInt(br.readLine());
		;
		int cnt = 0;
		for(int i = 0 ; i < N ; i++){
			String ring = br.readLine();
			if(ring.contains(find)){
				cnt++;
				continue;
			}
			for(int j = 1 ; j < find.length()+1 ; j++){
				String temp = "";
				for(int k = 0 ; k < find.length() ; k++){
					int index = (ring.length() - j + k) % ring.length();
					temp += ring.charAt(index);
				}
				if(find.equals(temp)){
					cnt++;
					continue;
				}
			}//j
		}
		bw.write(cnt+"");
		bw.close();
	}
}