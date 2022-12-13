package infrenalgorithm.section3.five;

import java.util.Scanner;

/**
 * 수학 방식
 */
public class MainTwo {

    public int solution(int n) {
        int answer = 0;
        int cnt = 1;

        n--;

        while (n > 0) {
            cnt++;
            n = n - cnt;

            if (n % cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        MainTwo T = new MainTwo();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(T.solution(n));
    }
}
