package hello.algorithm.dynamicprogramming;
import java.io.*;
/*
백준(2156)/ 포도주 시식
 */

public class DpNine {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(br.readLine());
        }


        //첫잔일 경우
        if(n >= 1){
            dp[0] = arr[0];
        }

        //두잔일 경우
        if(n >= 2){
            dp[1] = arr[0] + arr[1];
        }

        //세잔일 경우
        if(n >= 3){
            dp[2] = Math.max(dp[1], Math.max(dp[0] + arr[2], arr[1]+arr[2]));
        }
        for(int i = 3; i < n; i++){
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
        }
        System.out.println(dp[n-1]);
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
