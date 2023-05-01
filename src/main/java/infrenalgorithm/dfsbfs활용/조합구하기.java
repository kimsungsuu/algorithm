package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 조합구하기 {

    static int[] ch, arr;
    static int n,m;

    public void DFS(int L){
        if(L==m){
            for(int i = 1; i < m; i++){
                if(arr[i] < arr[i-1]) return;
            }
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = 1; i <= n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    arr[L] = i;
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        조합구하기 T  = new 조합구하기();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[m];
        ch = new int[n+1];

        T.DFS(0);
    }
}
