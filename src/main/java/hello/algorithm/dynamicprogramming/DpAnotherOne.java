package hello.algorithm.dynamicprogramming;
import java.io.*;

public class DpAnotherOne {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(recur(N,0));
    }
    static int recur(int N, int count){
        if(N < 2){
            return count;
        }else {
            return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
        }
    }
}
