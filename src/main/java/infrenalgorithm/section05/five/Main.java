package infrenalgorithm.section05.five;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str){
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        char chk = ' ';

        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else {
                stack.pop();
                if(chk == '(') {
                    answer += stack.size();
                }else {
                    answer++;
                }
            }
            chk = x;

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(T.solution(str));
    }
}
