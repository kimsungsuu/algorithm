package hello.algorithm.dynamicprogramming;

/*
백준 11722 가장 긴 감소하는 수열
 */
import java.io.*;
import java.util.StringTokenizer;

public class DpTwelve {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;

        for(int i = 2; i<=n; i++){
            dp[i] = 1;
            for(int j = 1; j < i; j++){
                if(arr[i] < arr[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }else if(arr[i] == arr[j]){
                    dp[i] = dp[j];
                }
            }
        }

        int max = 0;
        for(int i : dp){
            max = Math.max(max,i);
        }
        System.out.println(max);
    }
}
