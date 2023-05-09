package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 피자배달거리 {
    static int n, m;
    static int[][] arr;
    static int[] px, py;
    static int[] chPx, chPy;
    static int cnt;
    static int[] resultX;
    static int[] resultY;
    static int answer;

    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    static boolean flag;

    static boolean[][] ch;

    // 피자집 갯수Cm으로 나올 수 있는 조합의 경우 들
    public void DFS(int L, int s) {
        if(L == n){
            for (int i = 0; i < L; i++){
                System.out.print("(" + resultX[i] + ", " + resultY[i] + "), ");
            }
            System.out.println();
        }
        else{
            for(int i = s; i < cnt; i++){
                resultX[L] = px[i];
                resultY[L] = py[i];
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        피자배달거리 T = new 피자배달거리();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n + 1][n + 1];

        px = new int[n*n];
        py = new int[n*n];

        chPx = new int[n*n];
        chPy = new int[n*n];

        resultX = new int[n];
        resultY = new int[n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        cnt = 1;

        // 값이 2인 좌표 저장하기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(arr[i][j] == 2){
                    px[cnt] = i;
                    py[cnt] = j;
                    cnt++;
                }
            }
        }

        T.DFS(0,1);

        System.out.print(answer);
    }
}
