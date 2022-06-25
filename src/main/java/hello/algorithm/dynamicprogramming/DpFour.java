package hello.algorithm.dynamicprogramming;

import java.io.*;
public class DpFour {
    static int[] dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 1; i <=N; i++){
            int T = Integer.parseInt(br.readLine());
                for (int j = 4; j <= T; j++) {
                    dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
                }
                System.out.println(dp[T]);


        }


    }
    }

/*
* 1 = 1
* 2 = 2
3= 4
* 4 = 7
*
* * */

