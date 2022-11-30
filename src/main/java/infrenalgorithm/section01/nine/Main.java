package infrenalgorithm.section01.nine;

import java.util.Scanner;

public class Main {

    public int solution(String str){
        int answer = 0;

        str = str.toUpperCase().replaceAll("[A-Z]","");

        answer = Integer.parseInt(str);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
