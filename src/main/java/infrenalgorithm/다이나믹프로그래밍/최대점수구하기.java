package infrenalgorithm.다이나믹프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

class Problem {
    public int score;
    public int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }

}

public class 최대점수구하기 {

    public static void main(String[] args) {
        최대점수구하기 T = new 최대점수구하기();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] dy = new int[m+1];
        for(int i = 0; i < n; i++){
            // 문제 점수
            int ps = in.nextInt();
            // 문제 시간
            int pt = in.nextInt();

            // 하나의 문제를 한번만 풀 수 있으므로 냅색 알고리즘이 역행으로 뻗어나감
            for(int j = m; j >= pt; j--){
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }
        System.out.println(dy[m]);
    }
}
