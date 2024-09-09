import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int score[][] = {{12, 1600}, {11, 894}, {11, 1327}, {10, 1311}, {9, 1004}, {9, 1178}, {9, 1357}, {8, 837}, {7, 1055}, {6, 556}, {6, 773}};
        int N = Integer.parseInt(br.readLine());
        bw.write(score[N-1][0]+" "+score[N-1][1]);
        bw.close();
    }
}