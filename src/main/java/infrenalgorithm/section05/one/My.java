package infrenalgorithm.section05.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class My {
    public String solution(String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();



        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ')' && stack.isEmpty()) return "NO";

            if(str.charAt(i) == ')') stack.pop();
            else
            stack.push(str.charAt(i));

        }

        if(!stack.isEmpty()) return "NO";



        return answer;
    }

    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        System.out.println(T.solution(str));
    }
}
