package BaekJoon.다이나믹프로그래밍;

import java.util.Scanner;

public class 피보나치수1 {
    static int[] f;

    static int cntFib = 0;
    static int cntFibonacci = 0;

    // 재귀
    public int fib(int n){
        if(n==1 || n ==2){
            cntFib++;
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }

    // 피보나치 재귀
    public void fibonacci(int n){
        f[0] = 1;
        f[1] = 1;

        for(int i = 2; i < n; i++){
            cntFibonacci++;
            f[i] = f[i-2] + f[i-1];
        }
    }

    public static void main(String[] args) {
        피보나치수1 T = new 피보나치수1();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        f = new int[n+1];

        T.fib(n);
        T.fibonacci(n);

        System.out.print(cntFib + " " + cntFibonacci);
    }
}
