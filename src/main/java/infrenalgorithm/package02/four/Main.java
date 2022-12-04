package infrenalgorithm.package02.four;

import java.util.Scanner;

public class Main {

    public void solution(int n){
        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        T.solution(n);
    }
}