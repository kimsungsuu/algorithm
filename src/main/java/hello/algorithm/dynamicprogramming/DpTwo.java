package hello.algorithm.dynamicprogramming;
import java.io.*;

public class DpTwo {

    static Integer[] dp;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(bottomUp(N));

        br.close();
    }
    public static int bottomUp(int N){
        dp = new Integer[1001];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=N; i++){
            dp[i]=(dp[i-1]+dp[i-2]) % 10007;
        }
        return dp[N];
    }
}
