package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 피자배달거리 {
    static int n, m;
    static int[][] arr;
    static int[] px, py;
    static int cnt;
    static int[] resultX;
    static int[] resultY;
    static int result;
    static int temp3, temp4;

    // 피자집 갯수Cm으로 나올 수 있는 조합의 경우 들
    public void DFS(int L, int s) {
        if(L == m){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(arr[i][j] == 1){
                        int temp1;
                        int temp2;
                        temp3 = n;
                        for(int k = 0; k < L; k++){
                            if(i < resultX[k]) temp1 = (resultX[k] - i);
                            else temp1 = i - resultX[k];
                            if(j < resultY[k]) temp2 =(resultY[k] - j);
                            else temp2 = j - resultY[k];

                            temp3 = Math.min(temp3, temp1+temp2);
                        }
                        temp4 += temp3;
                    }
                }
            }
            result = Math.min(result, temp4);
            temp4 = 0;
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

        // 모든 피자집 좌표를 저장할 배열 px, pu
        px = new int[n*n];
        py = new int[n*n];

        // 모든 피자집에서 m개의 조합을 담을 배열
        resultX = new int[m];
        resultY = new int[m];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // 피자집 갯수만큼 px, py에 저장하기 위해 선언한 변수
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

        result = n*n;
        T.DFS(0,1);

        System.out.print(result);
    }
}
