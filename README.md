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
