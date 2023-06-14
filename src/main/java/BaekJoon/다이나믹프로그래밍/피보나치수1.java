package BaekJoon.다이나믹프로그래밍;

import java.util.Scanner;

public class 피보나치수1 {
    static int[] f;

    static int cntFib = 0;
    static int cntFibonacci = 0;

    public int fib(int n){
        cntFib++;
        if(n == 1 || n == 2) return 1;
        else return (fib(n-1) + fib(n-2));
    }

    public int fibonacci(int n){
        cntFibonacci++;
        if(n == 1 || n == 2) return 1;
        else{
            return f[n] = f[n-2] + f[n-1];
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
