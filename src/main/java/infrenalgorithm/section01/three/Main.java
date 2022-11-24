package infrenalgorithm.section01.three;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer ="";

        int m = Integer.MIN_VALUE;

        String[] s = str.split(" ");

        for(String x : s){
            int max = x.length();
            if(max > m){
                m = max;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(T.solution(str));
    }
}
