package hello.algorithm.dynamicprogramming;
import java.io.*;
import java.util.StringTokenizer;

/*
백준 11055 가장 긴 증가하는 수열 DP
 */
public class DpEleven {

    static int arr[];
    static int dp[];

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N+1];
        dp = new int[N+1];



        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        dp[1] = arr[1];

        for(int i = 2; i <= N; i++ ){
            dp[i] = arr[i];
            for(int j = 1; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[j] + arr[i], dp[i]);
                }
            }
        }

        int max = 0;
        for(int i = 1; i <= N; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        System.out.print(max);
    }
}
