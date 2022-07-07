package hello.algorithm.dynamicprogramming;
import java.io.*;
import java.util.*;

/*
가장 긴 증가하는 부분 수열 백준 11053
 */

public class DpTen {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        //배열 값들 입력
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = dp[1] =  1;

        //문제의 알고리즘
        for(int i = 1; i<n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }else if(arr[i] == arr[j]){
                    dp[i] = dp[j];
                }
            }
        }


        int max = 0;
        for(int i : dp){
            max = Math.max(max, i);
        }

        System.out.println(max);
            }
        }

