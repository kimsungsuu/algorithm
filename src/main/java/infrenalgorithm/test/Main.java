package infrenalgorithm.test;


import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String skill){
        int answer = 0;

        String tmp = "hello world";

        System.out.println(skill.indexOf("w"));
        System.out.println(tmp.indexOf("wor"));
        System.out.println(skill.indexOf("wor"));
        System.out.println(skill.indexOf("hello"));

        System.out.println(skill == tmp);
        System.out.println(skill.equals(tmp));


        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String skill = in.nextLine();

        System.out.println(T.solution(skill));

    }
}