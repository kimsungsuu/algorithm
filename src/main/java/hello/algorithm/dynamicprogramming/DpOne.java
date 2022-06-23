package hello.algorithm.dynamicprogramming;
import java.io.*;

/*
recursion을 이용한 알고리즘 풀이
 */
public class DpOne {

    static Integer[] dp;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        dp = new Integer[N+1]; //dp라는 배열에 N+1만큼의 공간이 마련되었다. 예를들어 N을 5라고 입력했을 시에 dp는 6의 공간이 마련된다.
        //6의 공간은 dp[0]~dp[6]으로 해석할 수 있다.

        dp[0]=dp[1]=0; //1을 찾는 알고리즘이므로 0이나 1일 때는 최솟값을 구하는 의미가 없기 때문에 선언

        System.out.println(rec(N));
    }

    static int rec(int N){
        if(dp[N]==null){
            if(N % 6 == 0){
                dp[N]=Math.min(rec(N-1), Math.min(rec(N /3), rec(N/2)))+1;
                //Math.min이 두개인 이유는 6은 3과 2의 배수인데, 3으로 나눈것과 2로 나눈 것의 최솟값을
                //구하고 그 값에서 -1을 한것과 최솟값을 다시한번 비교하여 최솟값을 구하기 위함이다.
            }
            //3으로만 나눌 수 있는 수
            else if(N % 3 == 0){
                dp[N]=Math.min(rec(N /3), rec(N-1))+1;
            }
            //2로만 나눌 수 있는 수
            else if(N % 2 ==0){
                dp[N]=Math.min(rec(N /2 ), rec(N - 1))+1;
            }else{
                dp[N]=rec(N-1)+1;
            }
        }
        return dp[N];
    }
}


