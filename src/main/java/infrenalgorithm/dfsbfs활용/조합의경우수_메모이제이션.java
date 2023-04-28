package infrenalgorithm.dfsbfs활용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 조합의경우수_메모이제이션 {
    static int n;
    static int r;
    static int[] arr;
    static int[] result;
    static int[] ch;
    static int[][] fibo;
    static int cnt;


    public void DFS(int L){

        if(L == r){
            Arrays.sort(result);
            for(int i = 0; i < cnt; i++){
                if(!Arrays.equals(fibo[i], result)) return;
            }

            for(int j = 0; j < r; j++){
                fibo[cnt][j] = result[j];
                System.out.print(result[j] + " ");
            }
            System.out.println();
            cnt++;

        }else{
            for(int i = 1; i <= n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    result[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        조합의경우수_메모이제이션 T = new 조합의경우수_메모이제이션();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        r = in.nextInt();
        cnt = 0;

        ch = new int[n+1];
        arr = new int[n+1];
        fibo = new int[10000][r];

        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        result = new int[r];

        T.DFS(0);
    }
}
