package infrenalgorithm.section05.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){

            if(x == '(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";



        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        System.out.println(T.solution(str));
    }
}

