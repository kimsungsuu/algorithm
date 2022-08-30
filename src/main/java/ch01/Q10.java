package ch01;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("a의 값 : ");
        a = sc.nextInt();

        System.out.println("b의 값 : ");
        b = sc.nextInt();

        while(a >= b){
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.println("b의 값 : ");
            b = sc.nextInt();
        }

        System.out.println("b - a는 " + (b-a) +"입니다.");
    }
}
