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
```java
for(int i = 0; i < 2; i++){
  for(int j = 2; j <=n; j++){
    dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + stickers[0][j];
    dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + stickers[1][j];
  }
}
```
로 정리할 수 있다. 여기서 의문점은 대각선 2칸내에서 더 큰 값을 선택한다는 것이다. 만약 대각선 3칸까지라고 가정한다면 대각선 2칸내에서 선택한 수보다 작을 수밖에 없다 왜냐하면 
2칸으로 설정했을 때 한번은 숫자가 더해져서 갔을 경우인데도 3칸을 설정한다면 중간에 더해져서 갔을 경우를 놓치게 되기 때문이다. 이 말은 즉슨 대각선 1칸씩 이동한다면 한번은 다른 숫자가 더해져서 그 다음 대각선 칸으로 이동했을것이고 여기서 도착한 대각선 칸이 따지고 보면 3번째 대각선 칸이다. 그렇다면 3번째 대각선칸 까지 점화식을 세운다면 한번의 대각선 칸 이동을 제외하게 되는 것이므로 최댓값이 아닌 경우의 수가 생기게 되는 것이다. 

# 2022.7.6
- LIS + DP
  - 최대 합의 수를 구해야 한다는 점에서 LIS와 다르다. 즉, 정해지는 배열이 다르다.
  - 예를 들어서 {1 100 2 50 60 3 5 6 7 8} 이란 배열이 주어졌을 때, LIS 라면 {1, 100}의 배열이 생성되었겠지만, DP의 기준으로는 {1,2,50,60}이 나오게 된다.
  - 알고리즘은 
    ```java
    for(int i = 2; i <= N; i++){
    dp[i] = arr[i];
    
      for(int j = 1; j < i; j++){
        if(arr[i] > arr[j]){
        dp[i] = Math.max(dp[j] + arr[i], dp[i]);
        }
      }
    }
    
    int max = 0;
    for(int i = 1; i <= N; i++){
      dp[i] = Math.max(max, dp[i]);
    }
    ```
    - 결론적으로는 LIS의 알고리즘을 잘 이해하고 있어야 풀 수 있는 문제다

# 2022.11.24

> - str.toUpperCase();
> - character.toUpperCase(t);
> - for(char c : str.toCharArray())
> - Character.isLowerCase(x);
> - ASCII Code 
>   - 대문자 : 65~90 
>   - 소문자 : 97~122
>   - 소문자 -> 대문자 str += (char)(x-32)
>   - 대문자 -> 소문자 str += (char)(x+32)
> - nextLine()
> - String[] s = str.split(" ");
> - int m = Integer.MIN_VALUE; 


# 2022.11.28

> - indexOf()
> - substring();

# 2022.11.29
> - infren Algorithm 4~8
> - ArrayList<>
> - StringBuilder().reverse().toString();
>   - StringBuilder() 와 String 객체의 차이는 변경 유무 차이, String 객체는 변경 불가능 StringBuilder()는 변경 가능.
>     - 상세) String 객체는 변경할 시에 새로운 String 객체를 만들고 변경 이전의 String 객체는 Garbage Collector 담겨있다가 삭제되는 형식으로 메모리를 많이 차지하지만
>     StringBuilder는 새로운 객체를 생성하지 않고 변경, 추가, 수정 등이 가능하다.
> - String tmp = String.valueOf(s);
>   - valueOf()는 Static으로 선언된 클래스 메소드.
> - Character.isAlphabetic(s[lt]) or !Character.isAlphabetic(s[lt])  
> - str.indexOf(str.charAt(i))
> - str.equalsIgnoreCase(tmp)
> - replaceAll()은 정규식 사용 가능, replace()는 불가능
>   - str = str.toUpperCase().replace("[^A-Z]","");

# 2022.11.30
> - infren Algorithm 9 ~11
> - ASCII CODE 48~57 : number0 ~ number9
>   - if(x >= 48 && x <= 57)
> - Character.isDisit(x)
> - Math.min/ Math.max
>   - Math.min(int a, int b) : a와 b 두 수중 더 작은 값을 반환하라. int b에 최댓값을 설정할 수 있음
>   - Math.max(int a, int b) : a와 b 두 수중 더 큰 수를 반환하라. int a에 최솟값을 설정할 수 있음

# 2022.12.01
> - infren Algorithm 12 or 1~7번 다시 풀어보기
> - Integer.paserInt(string, 2) // 문자열로 저장된 이진수 값을 10진수로 변경하는 메소드
>   - int tmp2 = Integer.parseInt(tmp,2);
>   - answer += (char)(tmp2);

# 2022.12.02
> - infren Algorithm 1번~12 2번 다시 풀기
> - indexOf(), split()
