package infrenalgorithm.package02.eleven;

import java.util.Scanner;

public class Main {
    public int solution(int n , int[][] arr){
        int answer = 0;


        int max = Integer.MIN_VALUE;
        for(int i = 1; i < n+1; i++){ // 열
            int cnt=0;
            for(int j = 1; j < n+1; j++){ // 행 인덱스
                for(int k = 1; k < n+1; k ++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max)
            {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                arr[i][j] = in. nextInt();
            }
        }

        System.out.println(T.solution(n,arr));
    }
}
