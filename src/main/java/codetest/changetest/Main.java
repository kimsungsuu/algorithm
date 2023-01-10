package codetest.changetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public String solution(String str, String str2){
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x : str2.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        if(!map.equals(map2)) answer = "NO";

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String str = in.next();
        String str2 = in.next();



        System.out.println(T.solution(str, str2));
    }
}