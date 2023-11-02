import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.print(factorial(n));
    }
    public static long factorial(long n){
        if(n==0){
            return 1;
        }else if(n==1){
            return n;
        }else{
            return n*factorial(n-1);
        }
    }
}