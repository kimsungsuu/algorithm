package BaekJoon.다이나믹프로그래밍;

import java.util.Scanner;

public class 피보나치수2 {



    public static void main(String[] args) {
        피보나치수2 T = new 피보나치수2();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long[] arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for(int i = 3; i <= n; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }

        System.out.println(arr[n]);
    }
}
