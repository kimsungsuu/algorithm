package infrenalgorithm.section05.four;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            int p1,p2=0;

            if(Character.isDigit(x)) stack.push(Integer.valueOf(x)-48);
            else{
                 p1 = stack.pop();
                 p2 = stack.pop();
                 if(x == '+') stack.push(p2+p1);
                 else if(x == '-') stack.push(p2-p1);
                 else if(x == '*') stack.push(p2*p1);
                 else stack.push(p2/p1);
            }
        }


        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(T.solution(str));
    }
}
