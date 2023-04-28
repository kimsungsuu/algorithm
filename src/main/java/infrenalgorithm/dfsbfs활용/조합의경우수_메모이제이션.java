package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 조합의경우수_메모이제이션 {

    int[][] fibo = new int[35][35];

    public int DFS(int n, int r){
        if(fibo[n][r] > 0) return fibo[n][r];
        if(n==r || r==0) return 1;
        else return fibo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }


    public static void main(String[] args) {
        조합의경우수_메모이제이션 T = new 조합의경우수_메모이제이션();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        System.out.println(T.DFS(n,r));
    }
}
