package ch01;
import java.util.Scanner;

public class Q18 {

    static void npria(int n){
        int a = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-(i-1); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2-1; j++){
                System.out.print(a);
            }
            for(int j = 1; j <= n-(i-1); j++){
                System.out.print(" ");
            }
            a++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        npria(n);
    }
}
