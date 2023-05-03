package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 미로탐색 {
    static int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    static int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    static int[][] arr;

    static int answer;

    public void DFS(int rL, int cL) { // rL = rowLevel, cL = column Level
        if (rL == 7 && cL == 7) answer++;
        else {
            for (int k = 0; k < 4; k++) {
                int nx = rL + dx[k];
                int ny = cL + dy[k];
                if (nx > 0 && ny > 0 && nx <= 7 && ny <= 7 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    DFS(nx, ny);
                    arr[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        미로탐색 T = new 미로탐색();
        Scanner in = new Scanner(System.in);

        arr = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        arr[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);
    }
}
