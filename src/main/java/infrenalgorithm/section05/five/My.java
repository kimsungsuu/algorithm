package infrenalgorithm.section05.five;

import java.util.Scanner;
import java.util.Stack;

public class My {
    public int solution(String str){
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            stack.push(x);
        }

        int cnt = 0;

        for(int i = 0; i < stack.size(); i++){
            if(stack.get(i) == '(') cnt++;
            if(stack.get(i) == ')' && stack.get(i-1) == '('){
                cnt--;
                answer += cnt;
            }else if(stack.get(i) == ')' && stack.get(i-1) == ')'){
                cnt--;
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(T.solution(str));
    }
}
