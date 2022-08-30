package ch01;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //long은 19자리 수 까지 입력 가능하다.
        long n = sc.nextLong();

        long a = n/10;
        int count = 1;

        while(a > 0){ //a는 자릿수를 구하기 위해 n을10으로 나눈 로직
            a /= 10;
            count++;
        }

        System.out.println("그 수는 " + count +"자리입니다.");
    }
}
