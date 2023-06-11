package BaekJoon.다이나믹프로그래밍;

import java.util.Scanner;

public class 피보나치수2 {
    int[] fib = new int[n+1];
    static int n;
    public int fib(int n){
        if(n<=1) return n;
        else{
            return fib[n] = fib[n-1] + fib[n-2];
        }
    }

    public static void main(String[] args) {
        피보나치수2 T = new 피보나치수2();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        System.out.println(T.fib(n));
    }
}
