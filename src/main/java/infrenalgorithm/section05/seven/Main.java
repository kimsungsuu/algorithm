package infrenalgorithm.section05.seven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String k, String str){
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();

        for(char x : k.toCharArray()){
            q.offer(x);
        }
        for(char x : str.toCharArray()){
            if(q.contains(x)){
                if(x != q.poll()) return "NO";
            }
        }

        if(!q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String k = in.next();
        String str = in.next();

        System.out.println(T.solution(k, str));
    }
}
