package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 피자배달거리 {
    static int n, m;
    static int[][] arr;
    static int[] px, py;
    static int cnt;
    static int answer;

    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    static boolean flag;

    static boolean[][] ch;

    public void DFS(int x, int y) {

    }

    public static void main(String[] args) {
        피자배달거리 T = new 피자배달거리();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n + 1][n + 1];

        px = new int[n*n];
        py = new int[n*n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(arr[i][j] == 2){
                    px[cnt] = i;
                    py[cnt] = j;
                    cnt++;
                }
            }
        }

        for(int i = 1; i < cnt; i++){
            System.out.print(px[i] + ", " + py[i]);
            System.out.println();
        }



        System.out.print(answer);
    }
}
