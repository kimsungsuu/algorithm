package codetest.changetest;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public String solution(String str, String t){
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();

        Queue<Character> qStr = new LinkedList<>();


        for(char x : str.toCharArray()){
            qStr.offer(x);
        }

        for(char x : t.toCharArray()){
            q.offer(x);
        }

        for(int i = 0; i < str.length(); i++){
            if(q.contains(qStr.peek())){
                qStr.offer(qStr.poll());
            }else qStr.poll();
        }

        String tmp = "";
        for(char x : qStr){
            tmp += x;
        }


        if(!tmp.equals(t)) answer = "NO";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String t = in.next();
        String str = in.next();

        System.out.println(T.solution(str, t));
    }
}