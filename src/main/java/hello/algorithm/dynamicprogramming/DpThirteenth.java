package hello.algorithm.dynamicprogramming;
import java.io.*;
import java.util.StringTokenizer;
/*
백준 11054 가장 긴 바이토닉 부분 수열
 */
public class DpThirteenth {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] dpLR = new int[n+1];
        int[] dpRL = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= n; i++){
            dpLR[i] = 1;
            for(int j = 1; j < i; j++){
                if(arr[i] > arr[j]){
                    dpLR[i] = Math.max(dpLR[j]+1, dpLR[i]);
                }
            }
        }

        for(int i = n; i > 0; i--){
            dpRL[i] = 1;
            for(int j = n; j > i; j--){
                if(arr[i] > arr[j]){
                    dpRL[i] = Math.max(dpRL[j]+1, dpRL[i]);
                }
            }
        }

        int max = 0;
        for(int i = 1; i <= n; i++){
            max = Math.max(max, dpLR[i] + dpRL[i]);
        }
        System.out.println(max - 1);

    }
}

/*
<알고리즘 풀이>
LIS 알고리즘 참고 링크 : https://yabmoons.tistory.com/143
- 왼->오/ 오->왼 LIS로 구하고 구해진 배열을 잘 더해주면 된다고 한다.
- LIS에서 기저상태는  Dp[1] = 1 이다. 왜냐하면 첫번째 인덱스보다 더 적은 인덱스가 없기 때문이다.
- LIS는 두가지 조건이 존재한다.
	- 첫째. 첫번째 인덱스부터 자신의 인덱스까지 자신의 수보다 작은 수를 찾는다.
	- 둘째. 자신의 인덱스보다 이후의 인덱스가 1이상 클때만 배열에 삽입한다. 자기 자신까지
	비교하여 count 한다.

- 정답 도출은 (증가하는 부분수열의 크기 + 감소하는 부분수열의 크기) - 1
	- 이유) 중복되는 수가 하나 존재하기 때문.

<알고리즘 대로 문제에 적용>
10
1 5 2 1 4 3 4 5 2 1

1,2,2,1,3,3,4,5,2,1

dp[1] = 1;

dp[2] = {1, 5} = 2

dp[3] = {1, 2} = 2

dp[4] = {1} = 1

dp[5] =  dp{1,2,4} = 3

dp[6] = dp{1,2,3} = 3

dp[7] = dp{1,2,3,4} = 4

dp[8] = dp{1,2,3,4,5} = 5

dp[9] = dp{1,2} = 2

dp[10] = 1

dpLR[10] = {1,2,2,1,3,3,4,5,2,1}
오 -> 왼
dp[1] = 1

dp[2] = {1,2} =2

dp[3] = {1, 2, 5} = 3

dp[4] = {1, 2, 4} = 3

dp[5] = {1,2,3} = 3

dp[6] = {1,2,3,4,} = 4

dp[7] = {1} = 1

dp[8] = {1,2,} = 2

dp[9] = {1,2, 3, 4, 5,} = 5

dp[10] = {1} = 1

dpRL = {1,5,2,....3,2,1} // index 10부터 값이 지정되므로 dp[10]이 index = 1이 된다.
dpLR = {1,2,2,1,3,3,4,5,2,1}

이 두 배열을 더해주고 각각의 인덱스 중에서 가장 큰 값을 가진 인덱스를 가져온다 그리고
그 값에서 -1을 해준것이 최종 결과일것이다.

 */
