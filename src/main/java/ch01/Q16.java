package ch01;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-(i-1); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= n-(i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
