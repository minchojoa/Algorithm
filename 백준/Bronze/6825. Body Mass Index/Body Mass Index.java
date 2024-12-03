import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		float weight = Float.parseFloat(br.readLine());
		float height = Float.parseFloat(br.readLine());	
		float BMI = weight/(height*height);
		
		if(BMI>25) {
			bw.write("Overweight");
		}else if(BMI>=18.5) {
			bw.write("Normal weight");			
		}else {
			bw.write("Underweight");			
		}
		bw.close();
	}
}