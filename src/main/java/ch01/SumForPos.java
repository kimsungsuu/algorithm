package ch01;
import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do{
            System.out.println("n을 입력합니다 : ");
            n = sc.nextInt();
        }while(n <= 0); //while이 true이기 때문에 n이 음수일 때 반복한다.

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("sum : " + sum);
    }
}
