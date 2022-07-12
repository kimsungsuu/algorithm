package hello.algorithm.dynamicprogramming;
import java.io.*;
import java.util.StringTokenizer;
/*
백준 11054 가장 긴 바이토닉 부분 수열
 */
public class DpThirteenth {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] dpLR = new int[n+1];
        int[] dpRL = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= n; i++){
            dpLR[i] = 1;
            for(int j = 1; j < i; j++){
                if(arr[i] > arr[j]){
                    dpLR[i] = Math.max(dpLR[j]+1, dpLR[i]);
                }
            }
        }

        for(int i = n; i > 0; i--){
            dpRL[i] = 1;
            for(int j = n; j > i; j--){
                if(arr[i] > arr[j]){
                    dpRL[i] = Math.max(dpRL[j]+1, dpRL[i]);
                }
            }
        }

        int max = 0;
        for(int i = 1; i <= n; i++){
            max = Math.max(max, dpLR[i] + dpRL[i]);
        }
        System.out.println(max - 1);

    }
}
