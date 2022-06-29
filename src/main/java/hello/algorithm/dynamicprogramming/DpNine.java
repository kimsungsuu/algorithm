package hello.algorithm.dynamicprogramming;
import java.io.*;

public class DpNine {
    static int[] dp;
    final static int mod = 10007;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n+1];
        dp[0] =0;
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        System.out.println(dp[n]);
    }
}
/*
10 = 1
100,101 = 2
1000,1001,1010 = 3
10000,10001,10010,10100,10101 = 5
100000,100001,100010,100100,100101,101000,101001,101010 = 8
dp[i] = [i-2]+dp[i-1]

 */
