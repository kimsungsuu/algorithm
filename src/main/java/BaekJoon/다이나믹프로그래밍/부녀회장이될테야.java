package BaekJoon.다이나믹프로그래밍;

import java.util.Scanner;

public class 부녀회장이될테야 {
    static int[][] dy;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 테스트 케이스 수 입력
        int testCase = in.nextInt();

        dy = new int[15][15];

        for(int j = 0; j <= 0; j++){
            for(int l = 1; l <= 14; l++){
                dy[j][l] = l;
            }
        }

        for(int j = 1; j <= 14; j++){
            for(int s = 1; s <= 14; s++){
                for(int l = 1; l <= s; l++){
                    dy[j][s] += dy[j-1][l];
                }
            }
        }

        for(int i = 0; i < testCase; i++){
            // 층수 입력
            int k = in.nextInt();
            // 호수 입력
            int n = in.nextInt();
            System.out.println(dy[k][n]);
        }

    }
}
