package ch01;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        int i;

        int n = stdIn.nextInt();

        for(i = 1; i <= n; i++){

            sum += i;

            if(i < n) {
                System.out.print(i + " + ");
            }else{
                System.out.print(i + " = " + sum);
            }
        }

    }
}
