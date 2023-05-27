package infrenalgorithm.다이나믹프로그래밍;

import java.util.Scanner;

public class 최대부분증가수열 {
    static int[] dy;

    public int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        // 첫번째 최대 부분 수열을 반드시 1이므로
        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                // 최대 부분 수열을 구하는 과정
                // max는 나의 인덱스 이전에 최대로 나올 수 있는 경우의 수를 가지고 있게 됨.
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }

            // i번째에서 가지는 최대 부분 수열 값
            // + 1하는 이유는 dy[i] 번째를 포함하고 있지 않기 떄문임
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        최대부분증가수열 T = new 최대부분증가수열();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
