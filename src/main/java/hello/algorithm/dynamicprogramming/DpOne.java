package hello.algorithm.dynamicprogramming;
import java.io.*;

public class DpOne {

    static Integer[] dp;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        dp = new Integer[N+1]; //dp라는 배열에 N+1만큼의 공간이 마련되었다. 예를들어 N을 5라고 입력했을 시에 dp는 6의 공간이 마련된다.
        //6의 공간은 dp[0]~dp[6]으로 해석할 수 있다.
        dp[0]=dp[1]=0;

        System.out.println(rec(N));


    }

    static int rec(int N){
        if(dp[N]==null){
            if(N % 6 == 0){
                dp[N]=Math.min(rec(N-1), Math.min(rec(N /3), rec(N/2)))+1;
            }
            else if(N % 3 == 0){
                dp[N]=Math.min(rec(N /3), rec(N-1))+1;
            }
            else if(N % 2 ==0){
                dp[N]=Math.min(rec(N /2 ), rec(N - 1))+1;
            }else{
                dp[N]=rec(N-1)+1;
            }
        }
        return dp[N];
    }
}


