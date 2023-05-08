package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 피자배달거리 {
    static int n, m;
    static int[][] arr;
    static int cnt;
    static int answer;

    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    static boolean flag;

    static boolean[][] ch;

    public void DFS(int x, int y) {
        for (int i = 0; i < 4; i++) {
            if (flag) return;

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx > 0 && ny > 0 && nx <= n && ny <= n && arr[nx][ny] == 2) {
                answer++;
                flag = true;
                cnt++;
                return;
            }

            if (nx > 0 && ny > 0 && nx <= n && ny <= n && arr[nx][ny] != 2 && !flag) {
                if (!ch[nx][ny]) {
                    ch[nx][ny] = true;
                    DFS(nx, ny);
                }
            }
        }

    }

    public static void main(String[] args) {
        피자배달거리 T = new 피자배달거리();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 1 && cnt <= m) {
                    flag = false;
                    ch = new boolean[n + 1][n + 1];
                    T.DFS(i, j);
                }
            }
        }

        System.out.print(answer);
    }
}
