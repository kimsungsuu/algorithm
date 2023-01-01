package codetest.changetest;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            if(x == ')') stack.pop();
        }


        if(!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

       String str = in.next();
        System.out.println(T.solution(str));
    }
}
