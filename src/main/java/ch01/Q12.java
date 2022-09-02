package ch01;

/*
* printf("%3d") 규격을 이용해 출력하는 것이 관건.
* printf에 대한 이해와 %3d에 대한 이해가 필요
* */

public class Q12 {
    public static void main(String[] args) {

        System.out.print("  |");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+--------------------------");

        for(int i = 1; i <= 9; i++){
            System.out.print(i + " |");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }
}
