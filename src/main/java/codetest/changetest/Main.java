package codetest.changetest;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        char tmp = ' ';
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {

                if(tmp == ')'){
                    stack.pop();
                    answer += 1;
                }else{
                    stack.pop();
                    answer += stack.size();
                }

            }

            tmp = x;
        }
        return answer;
    }
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            Main T = new Main();

            String str = in.next();

            System.out.println(T.solution(str));
        }
    }