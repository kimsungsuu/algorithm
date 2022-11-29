package infrenalgorithm.section01.seven;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(tmp)) return answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String str = in.next();
        System.out.println(T.solution(str));
    }
}