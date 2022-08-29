package ch01;

import java.util.Scanner;

public class Q9 {

    public int sumof(int a, int b){

        int sum = 0;

        if(a < b){
            sum = a;
            for(int i = a+1; i <= b; i++){
                sum += i;
            }
        }else{
            sum = b;
            for(int i = b+1; i <= a; i++){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Q9 sum = new Q9();

        System.out.println("sum : " + sum.sumof(a,b));


    }
}
