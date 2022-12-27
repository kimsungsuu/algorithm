package infrenalgorithm.section05.seven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class My {
    public String solution(String k, String str){
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();

        int rt = 0;
        String tmp = "";

        for(char x : str.toCharArray()){
            if(rt < k.length()){
                if(x == k.charAt(rt)){
                    q.offer(x);
                    rt++;
                }
            }
            if(!q.isEmpty()){
                tmp += q.poll();
            }
        }

        if(!tmp.equals(k)) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        String k = in.next();
        String str = in.next();

        System.out.println(T.solution(k, str));
    }
}
