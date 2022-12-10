package codetest;

import java.util.Scanner;

public class ChangeTest {

        public int solution(int n, int[][] arr){
            int answer = 0;

            int min = Integer.MIN_VALUE;
            int cnt;

            for(int i = 0; i < n; i++){
                cnt = 0;
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < n; k++){
                        if(arr[i][k] == arr[j][k]) {
                            cnt++;
                            break;
                        }
                    }
                    if(cnt > min) {
                        min = cnt;
                        answer = i+1;
                    }
                }
            }
            return answer;
        }

        public static void main(String[] args){
            ChangeTest T = new ChangeTest();
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





