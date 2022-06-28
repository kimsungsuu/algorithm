package hello.algorithm.dynamicprogramming;
import java.io.*;

public class DpSeven {
    static int[] dp;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[91];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        System.out.println(dp[n]);
    }
}


