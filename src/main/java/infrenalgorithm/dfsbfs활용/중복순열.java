package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 중복순열 {
    static int[] pm;
    static int n;
    static int m;


    public void DFS(int L){
        if(L == m){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = 1; i <= n; i++){
                pm[L] = i;
                DFS(L+1);
            }
        }
    }



    public static void main(String[] args) {
        중복순열 T = new 중복순열();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        pm = new int[m];

        T.DFS(0);
    }
}
