package infrenalgorithm.section05.seven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MyTwo {
    public String solution(String k, String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        int rt = 0;
        String tmp = "";

        for(char x : str.toCharArray()){
            if(rt < k.length()){
                if(x == k.charAt(rt)){
                    stack.push(x);
                    rt++;
                }
            }
            if(!stack.isEmpty()){
                tmp += stack.pop();
            }
        }

        if(!tmp.equals(k)) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        MyTwo T = new MyTwo();
        Scanner in = new Scanner(System.in);

        String k = in.next();
        String str = in.next();

        System.out.println(T.solution(k, str));
    }
}
