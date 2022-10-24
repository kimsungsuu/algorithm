package ch02;
import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxOf(int a[]){
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
//        Scanner sc = new Scanner(System.in);

        System.out.println("몸무게 최댓값을 구합니다");
        System.out.println("사람 수");
        int num = 1 + rand.nextInt(9);

        int[] weight = new int[num];

        for(int i = 0; i < num; i++){
            weight[i] = 40 + rand.nextInt(40);
            System.out.println(i + "번째 weight :" + weight[i]);
        }

        System.out.println("최고 몸무게 ㅊㅊ : " + maxOf(weight));
    }
}
