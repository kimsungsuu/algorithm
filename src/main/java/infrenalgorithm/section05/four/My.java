package infrenalgorithm.section05.four;

import java.util.Scanner;
import java.util.Stack;

public class My {
    public int solution(String str){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            int p1,p2=0;
            if(!stack.isEmpty() && x == '+') {
                p1 = stack.pop();
                p2 = stack.pop();
                stack.push(p2+p1);
            }
            else if(!stack.isEmpty() && x == '-') {
                p1 = stack.pop();
                p2 = stack.pop();
                stack.push(p2-p1);
            }
            else if(!stack.isEmpty() && x == '*') {
                p1 = stack.pop();
                p2 = stack.pop();
                stack.push(p2*p1);
            }
            else if(!stack.isEmpty() && x == '/') {
                p1 = stack.pop();
                p2 = stack.pop();
                stack.push(p2/p1);
            }
            else stack.push(Integer.valueOf(x)-48);
            System.out.println(stack);
        }


        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(T.solution(str));
    }
}
