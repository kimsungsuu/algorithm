package codetest.changetest;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr){
        int answer = 0;

        int[] px = {-1, 0, 1, 0};
        int[] py = {0, 1, 0, -1};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean validation = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + px[k];
                    int ny = j + py[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                        if(arr[i][j] <= arr[nx][ny]) {
                            validation = false;
                            break;
                        }
                    }
                }
                if(validation) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}