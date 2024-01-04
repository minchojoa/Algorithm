import java.io.*;
import java.time.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LocalDate now = LocalDate.now();
		bw.write(now.getYear()+"\n");
		bw.write(now.getMonthValue()+"\n");
		bw.write(now.getDayOfYear()+"\n");
		bw.close();
	}
}