package infrenalgorithm.section3.five;

import java.util.Scanner;

public class Main {

    public int solution(int n){
        int answer = 0;
        
        int lt = 0, sum = 0;


        // sum 값이 n일 때 answer++;
        // 0 -> n-1까지 돌 때 좌표 lt, rt를 두고 lt부터 rt를 더한 값(sum)이 answer가 나와야함.
        // lt ~ rt까지 더한 값이 n을 넘어갈 때 lt를 제거해준다.
        
        for(int rt = 0; rt <= n/2+1; rt++){
            sum += rt;

            if(sum == n) answer++;

            while(sum > n){
                sum -= lt++;
                if(sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(T.solution(n));
    }
}
