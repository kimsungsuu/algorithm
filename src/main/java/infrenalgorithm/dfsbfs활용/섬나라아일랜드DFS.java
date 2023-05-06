package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 섬나라아일랜드DFS {
    static int n, answer;

    static int[][] arr;

    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    int[] diaX = {-1,-1,1,1};
    int[] diaY = {-1,1,-1,1};

    public void DFS(int x, int y){

        for (int j = 0; j < 4; j++) {
            int nx = x + dx[j];
            int ny = y + dy[j];
            int nXD = x + diaX[j]; // nextXDiagonal
            int nYD = y + diaY[j]; // nextYDiagonal

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 1){
                arr[nx][ny] = 2;
                DFS(nx, ny);
            }

            if (nXD >= 0 && nYD >= 0 && nXD < n && nYD < n && arr[nXD][nYD] == 1){
                arr[nXD][nYD] = 2;
                DFS(nXD, nYD);
            }
        }
    }

    public static void main(String[] args) {
        섬나라아일랜드DFS T = new 섬나라아일랜드DFS();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1) {
                    T.DFS(i, j);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
