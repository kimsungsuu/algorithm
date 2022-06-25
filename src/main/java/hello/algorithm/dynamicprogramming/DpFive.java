package hello.algorithm.dynamicprogramming;
import java.io.*;

public class DpFive {

        static Long[][] dp;
        static int N;
        final static long MOD = 1000000000;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            N = Integer.parseInt(br.readLine());
            dp = new Long[N + 1][10];

            // 첫번째 자릿수는 1로 초기화
            for(int i = 0; i < 10; i++) {
                dp[1][i] = 1L;
            }

            long result = 0;

            // 마지막 자릿수인 1~9까지의 경우의 수를 모두 더해준다.
            for(int i = 1; i <= 9; i++) {
                result += recur(N, i);
            }
            System.out.println(result % MOD);
        }

	/*
	 dist 는 자릿수, val은 자릿값을 의미함

	 첫째 자리수는 각 val이 끝이기 때문에
	 경우의 수는 1밖에 없다. 즉, dp[1]의 각 자릿값은
	 1로 초기화 되어있어야한다.
	*/

        static long recur(int digit, int val) {

            // 첫째 자리수에 도착한다면 더이상 탐색할 필요 없음
            if(digit == 1) {
                return dp[digit][val];
            }

            // 해당 자리수의 val값에 대해 탐색하지 않았을 경우
            if(dp[digit][val] == null) {
                // val이 0일경우 다음은 1밖에 못옴
                if(val == 0) {
                    dp[digit][val] = recur(digit - 1 ,1);
                }
                // val이 1일경우 다음은 8밖에 못옴
                else if(val== 9) {
                    dp[digit][val] = recur(digit - 1, 8);
                }
                // 그 외의 경우는 val-1과 val+1 값의 경우의 수를 합한 경우의 수가 됨
                else {
                    dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
                }
            }
            return dp[digit][val] % MOD;
        }
    }

/*
1 = dp[1]= 1,2,3,4,5,6,7,8,9 = 10 - 1
2 = 20 - 3 = dp[N-1] * N -1 = 17
3 = 101,121,123,212,232,210,321,323,343,345,432,434,454,456,565,567,543,545,
676,678,654,656,767,766,787,789,898,878,876,989,987,
= 17*3 - 2
 */
