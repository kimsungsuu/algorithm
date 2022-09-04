package ch01;
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
    static void triangleRB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                for(int k = 1; k <= (n-i); k ++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n){
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                if(i >= 2){
                    for(int k = j; k < i; k++){
                        System.out.print(" ");
                    }
                }
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
