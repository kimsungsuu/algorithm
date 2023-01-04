package codetest.changetest;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[][] arr){
        int answer = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int px, py;
                    px=py=0;
                    for(int l = 0; l < n; l++){
                        if(arr[k][l] == i) px = l;
                        if(arr[k][l] == j) py = l;
                    }
                    if(px < py) cnt++;
                }
                if(cnt == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(T.solution(n, m, arr));
    }
}