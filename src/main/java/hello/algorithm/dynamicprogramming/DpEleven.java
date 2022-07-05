package hello.algorithm.dynamicprogramming;
import java.io.*;
import java.util.StringTokenizer;

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
        recur(N);
        int max = 0;
        for(int i = 1; i <= N; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.print(max);



    }
    public static int recur(int N){
        if(dp[N] == 0){
            dp[N] = arr[N];
            for(int i = N-1; i >= 1; i--){
                if(arr[i] < arr[N]){
                    dp[N] = Math.max(recur(i) + arr[N], dp[N]);
                }else{
                    recur(i);
                }
            }
        }
        return dp[N];
    }
}
