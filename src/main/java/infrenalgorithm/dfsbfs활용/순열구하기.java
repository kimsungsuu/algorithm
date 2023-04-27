package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 순열구하기 {

    static int n;
    static int m;
    static int[] arr;
    static int[] result;
    static int[] ch;

    public void DFS(int L){
        if(L == m){
            for(int x : result){
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for(int i = 0; i < n; i++){
                if(ch[arr[i]] == 0){
                  ch[arr[i]] = 1;
                  result[L] = arr[i];
                  DFS(L+1);
                  ch[arr[i]] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        순열구하기 T = new 순열구하기();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n];
        ch = new int[11];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        result = new int[m];

        T.DFS(0);
    }
}
