package codetest.changetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public char solution(int n, String str){
        char answer = ' ';
        int tmp = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for (char x : map.keySet()){
            int k = map.get(x);
            if(tmp < k){
                tmp = k;
                answer = x;
            }
        }


        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();


        System.out.println(T.solution(n, str));
    }
}