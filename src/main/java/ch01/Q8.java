package ch01;
import java.util.Scanner;


public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i;

        int n = sc.nextInt();

        if(n%2==0){
            sum = (1+n)*(n/2);
        }else{
            sum = (1+n)*(n/2)+((n/2)+1);

        }

        System.out.println("sum : " + sum);
    }
}
