package infrenalgorithm.section05.two;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class My {
    public ArrayList<Character> solution(String str){
        ArrayList<Character> answer = new ArrayList<>();

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            stack.push(x);

            if(x == ')') {
                while (stack.peek()!='(') {
                    stack.pop();
                }
                stack.pop();
            }

        }


        for(int i = 0; i < stack.size(); i++){
            answer.add(stack.get(i));
        }



        return answer;
    }

    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        String str = in.next();

        for(char x : T.solution(str)) System.out.print(x);
    }
}
