package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 조합구하기강사풀이 {

    static int[] ch, arr;
    static int n,m;

    public void DFS(int L, int s){
        if(L==m){
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = s; i <= n; i++){
                arr[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        조합구하기강사풀이 T = new 조합구하기강사풀이();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[m];
        ch = new int[n+1];

        T.DFS(0, 1);
    }
}
