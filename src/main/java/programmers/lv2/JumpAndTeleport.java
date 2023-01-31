package programmers.lv2;

import java.util.Scanner;

public class JumpAndTeleport {
    public int solution(int n){
        int answer = 0;

        while(n > 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n /= 2;
                answer++;
            }
            System.out.println("n = " + n + " answer = " + answer);

        }
        answer++;
        return answer;
    }

    public static void main(String[] args) {
        JumpAndTeleport T = new JumpAndTeleport();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(T.solution(n));
    }
}
