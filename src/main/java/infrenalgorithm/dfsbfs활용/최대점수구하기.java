package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 최대점수구하기 {
    static int n;
    static int m;
    static int[][] arr;
    static int answer;

    public void DFS(int L, int rowSum, int colSum){
        if(colSum > m) return;
        if(L == n){
            answer = Math.max(answer, rowSum);
        }
        else{
            DFS(L+1, rowSum+arr[L][0], colSum+arr[L][1]);
            DFS(L+1, rowSum, colSum);
        }
    }

    public static void main(String[] args) {
        최대점수구하기 T = new 최대점수구하기();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = in.nextInt();
            }
        }

        T.DFS(0,0,0);

        System.out.println(answer);
    }
}
