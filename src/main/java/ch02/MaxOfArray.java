package ch02;
import java.util.Scanner;

public class MaxOfArray {

    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("가장 높은 몸무게를 구합니다");
        System.out.print("사람 수 : ");

        int num = sc.nextInt();

        int[] weight = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print(i + "번째 후보자 몸무게를 입력하세요 : ");
            weight[i] = sc.nextInt();
        }

        System.out.println("후보자중 가장 높은 몸무게 소유자는?" + maxOf(weight));
    }
}
