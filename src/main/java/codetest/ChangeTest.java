package codetest;

import java.util.Scanner;

public class ChangeTest {


    public String solution(String str){
        String answer = "NO";

        str = str.toUpperCase().replace("[^A-Z]","");

        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) answer = "YES";

        System.out.println("tmp = " + tmp);
        System.out.println("str = " + str);

        return answer;
    }

    public static void main(String[] args){
        ChangeTest T = new ChangeTest();
        Scanner in=new Scanner(System.in);

        String str = in.next();
        System.out.println(T.solution(str));
    }
}


