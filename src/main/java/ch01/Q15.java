package ch01;
import java.util.ArrayList;
import java.util.Scanner;

public class Q15 {

    //클래스에서 전역으로 쓰이는 메서드이기 때문에 static으로 선언한다.
    //반환하는 자료형이 없기 때문에 메서드에 void라고 지정해준다.
    //void 형인 메서드를 인자와 함께 호출하게 되면 메서드의 로직이 실행이 된다.

    static void triangleLB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void triangleLU(int n){
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    * RB, RU는 for문의 특성을 제대로 이해하지 못해서 풀지 못했다.
    * for문 안에 int j 방식을 두개를 따로 따로 만들어서 위 -> 아래로 실행되는 성질만 이해했어도 풀 수 있는 문제였다..
    * */
    static void triangleRB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //for(int j)가 두개 있어도 된다는걸 몰랐다....
    static void triangleRU(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Q15 q15 = new Q15();

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");
        q15.triangleLB(n);
        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력");
        q15.triangleLU(n);
        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력");
        q15.triangleRU(n);
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력");
        q15.triangleRB(n);

    }
}
