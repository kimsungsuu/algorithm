package infrenalgorithm.다이나믹프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

public class 동전교환 {
    static int[] dy;
    static int n, m;
    public int solution(Integer[] arr){

        // 최솟값을 구해야하므로 미리 최댓값을 넣어놓는다.
        Arrays.fill(dy, Integer.MAX_VALUE );

        // 거스름 돈 0원은 항상 0원이므로
        dy[0] = 0;


        for (int i = 0; i < arr.length; i++){
            for(int j = arr[i]; j <= m; j++){
                // i = 2일 떄 dy[14] = dy[14 - 5] + 1 = dy[9] = 3 + 1 = 5 + 2 + 2 + 5
                dy[j] = Math.min(dy[j], dy[j - arr[i]]+1);
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        동전교환 T = new 동전교환();
        Scanner in = new Scanner(System.in);

        // 동전의 종류 개수
        n = in.nextInt();

        Integer[] arr = new Integer[n];

        // 동전의 종류 초기화
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        // 거슬러줄 금액
        m = in.nextInt();
        dy = new int[m+1];

        System.out.println(T.solution(arr));
    }
}
