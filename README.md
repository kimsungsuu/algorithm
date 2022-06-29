# algorithm

## Today(2021.11.22) learned HashTable Algorithm and created with Java!!👍

## Today(2021.11.23) learned ArrayList and created with Java!! 👍

## Today(2021.11.25) learned StringBuilder and created with Java!! 👍

## Today(2021.11.27) learned ArrayVerifyDuplicate and created with Java!! 👍

## Today(2021.11.27) learned ArraySubstitution and created with Java!! 👍

## Today(2021.11.28) learned ArrayUrlEncoding and created with Java!! 👍

## Today(2022.01.20) learned greedy and created with Java!!

# 2022.6.11
- 백준 입출력 문제 공부
- Using Scanner, BufferedReader, StringBuilder, InputStreamReader, StringTokenizer
- 관련 도움 사이트
  - 인프런 기본 알고리즘 강의     
    - https://www.inflearn.com/course/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B0%95%EC%A2%8C/dashboard
  - 처음 알고리즘 공부 시작할 때 팁
    - https://plzrun.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4PS-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0

# 2022.6.14
- 백준 입출력 문제 공부
- StringTokenizer를 이용해 공백을 인식, 덧셈 입출력 문제 해결

# 2022.6.15
- BufferedReader를 이용한 덧셈 출력, StringTokenizer를 이용해 공백 인식, 자바 출력의 기본 양식 공부.
- getBytes()를 이용하여 입력받은 문자열을 byte배열로 변환해주어 값을 더해주었다.
- substring()를 이용한 문자열/

# 2022.6.21
- Dynamic Programming에서 N을 1로 만드는 최솟값을 구하는 문제를 해결할 때
  - recursion memoization을 사용하는 방법 또는 수를 따로 저장하지 않고 count에 담아 출력하는 방법 두가지가 있다.
    - recursion memoization을 사용했을 시에는 dp 배열을 생성하고, Math.min을 사용하여 최솟값을 구하는 방법을 사용할 수 있다.
    - count에 담는 경우엔 입력한 Math.min과 (N/2, count + 1 + (N%2)) 공식을 사용하여 해결할 수 있다.(자세한 내용은 DpOne 또는 DpAnotherOne을 참고.) 
    
# 2022.6.23
- DP 알고리즘에 대한 상세한 설명과 이해를 도와주는 블로그 https://hongjw1938.tistory.com/49
  - DP 알고리즘의 해석, 문제에 적용 하는 방법이 수록되어있음.
  
# 2022.6.24
- 위에서 소개했던 블로그에서 말하는 것처럼 DP 문제를 푸는 순서가 존재한다. 가장 중요한건 DP를 적용해야하는 문제인가 아닌가를 구별하는 일일 것이다. 예를 들어 1로 만들기 문제는 3으로 나누는 경우 2로 나누는 경우 -1을 하는 경우로 문제가 주어졌다. 이는 모두 Subproblems 방식을 적용할 수 있다 왜냐하면 주어진 조건의 경우를 모두 dp라는 배열에 저장하여(memoization) 메모리 사용량을 현저히 줄일 수 있는 동적계획법에 해당하기 때문이다. 
- 만약 DP를 적용할 수 있는 문제인것을 확인했다면 문제의 변수를 파악해야하는데 1로 만들기의 경우 3과2의 배수인 6이라는 변수 사항이 존재했다. 
- 변수 간 관계식을 만들기(점화식) dp[N]이 null이라는 가정하에 memoization을 통해서 math.min을 사용해 최솟값을 구하면 될 문제이다.(DpOne코드 참고)
- 또 다른 방식으로는 그냥 count 하는 방식이 있다. 이는 memoization을 사용하지 않으므로 계산 시간이 현저히 단축할 수 있다. 
- 기저 상태 파악하기 1로 만드는 문제이므로 dp[N]이 0이나 1이 주어졌을 때는 return
하거나 1을 출력하도록 설정해주면 기저상태 파악이 완료되고 마지막으로 구현만 하면 된다.

# 2022.6.26
- 알고리즘은 유형 별로 정해진 공식이 있다고 생각한다. 따라서 어느정도 시간이 지나도 해결이 안되는 문제는 알고리즘 해석을 보고 문제를 다시 풀어보고 그래도 점화식이 구해지지 않는다면 해답을 보고 점화식을 이해하는것도 좋은 방법이라고 생각한다. 예를 들어 DP문제여서 재귀 방식을 사용해서 문제를 풀다가 모르겠다면 남이 해석해놓은 알고리즘을 보고 다시 점화식을 세워보고 그래도 풀리지 않는다면 해답을 보고 이해하는것도 좋은 방법이라고 생각한다.
- 1씩 차이나는 쉬운 계단 수 문제의 경우 dp[i][j]가 주어진 경우에 j가 0이라면 끝자리가 0이라는 의미이므로 그 앞의 수는 1이외에는 다른 수가 올 수 없다. 이를 테면 N이 2라고 주어졌을 때 10과 N이 3인 경우 101,121 과 같이 맨 앞자리가 0이 올 수 없기 때문에 j가 0인 경우 dp[i-1][1]이라는 결론이 날 수 있고 i=2 j가 9인 경우 98이외에 다른 수는 올 수 없으므로 
- dp[i-1][8]이라는 결론이 날 수 있다. 이 이외의 수는 dp[i-1][j-1]+dp[i-1][j+1]과 여기서 memoization된 값들을 result라는 값에 모두 더하게 되면 result += dp[N][i]가 (0~9까지) 로 알고리즘을 세울 수 있는 것이다.

# 2022.6.28
- 오르막 수의 알고리즘 계산법은 N의 자리수가 주어졌을 때 dp[N-1][k]와 같거나 dp[N-1][k]보다 작은수를 모두 더해주는 방법이다. 

# 2022.6.29
- 스티커 문제는 다이내믹 프로그래밍 알고리즘을 요구하는 문제이다. 이 문제는 대각선 1칸 또는 2칸에서 더 큰 값을 선택해 저장하는 방식을 사용한다. 이를 점화식으로 정리하면
/*
for(int i = 0; i < 2; i++){
  for(int j = 2; j <=n; j++){
    dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + stickers[0][j];
    dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + stickers[1][j];
  }
}
*/
로 정리할 수 있다. 여기서 의문점은 대각선 2칸내에서 더 큰 값을 선택한다는 것이다. 만약 대각선 3칸까지라고 가정한다면 대각선 2칸내에서 선택한 수보다 작을 수밖에 없다 왜냐하면 
2칸으로 설정했을 때 한번은 숫자가 더해져서 갔을 경우인데도 3칸을 설정한다면 중간에 더해져서 갔을 경우를 놓치게 되기 때문이다. 이 말은 즉슨 대각선 1칸씩 이동한다면 한번은 다른 숫자가 더해져서 그 다음 대각선 칸으로 이동했을것이고 여기서 도착한 대각선 칸이 따지고 보면 3번째 대각선 칸이다. 그렇다면 3번째 대각선칸 까지 점화식을 세운다면 한번의 대각선 칸 이동을 제외하게 되는 것이므로 최댓값이 아닌 경우의 수가 생기게 되는 것이다. 

 
