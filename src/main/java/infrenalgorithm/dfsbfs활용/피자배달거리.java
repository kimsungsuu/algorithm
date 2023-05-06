package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 피자배달거리 {
    static int n,m;
    static int[][] arr;

    public static void main(String[] args) {
        피자배달거리 T = new 피자배달거리();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();;
        m = in.nextInt();

        arr = new int[n+1][n+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
