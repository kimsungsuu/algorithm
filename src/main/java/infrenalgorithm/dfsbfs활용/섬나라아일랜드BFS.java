package infrenalgorithm.dfsbfs활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class SumnaraPoint{
    public int x,y;

    public SumnaraPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 섬나라아일랜드BFS {

    static int n, answer;

    static int[][] arr;

    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    int[] diaX = {-1,-1,1,1};
    int[] diaY = {-1,1,-1,1};

    public void BFS(int x, int y) {
        if (arr[x][y] == 2) return;

        Queue<SumnaraPoint> Q = new LinkedList<>();

        Q.offer(new SumnaraPoint(x, y));

        arr[x][y] = 2;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i < len; i++){
                SumnaraPoint sP = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = sP.x + dx[j];
                    int ny = sP.y + dy[j];
                    int nXD = sP.x + diaX[j]; // nextXDiagonal
                    int nYD = sP.y + diaY[j]; // nextYDiagonal

                    if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 1){
                        arr[nx][ny] = 2;
                        Q.offer(new SumnaraPoint(nx, ny));
                    }

                    if (nXD >= 0 && nYD >= 0 && nXD < n && nYD < n && arr[nXD][nYD] == 1){
                        arr[nXD][nYD] = 2;
                        Q.offer(new SumnaraPoint(nXD, nYD));
                    }
                }
            }
        }
        answer++;
    }
    public static void main(String[] args) {
        섬나라아일랜드BFS T = new 섬나라아일랜드BFS();
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
                if(arr[i][j] == 1) T.BFS(i, j);
            }
        }

        System.out.println(answer);
    }
}
