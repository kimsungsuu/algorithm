package codetest.changetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public int solution(String a, String b){

        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();


        int lt = 0;

        for(int i = 0; i < b.length()-1; i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
        }

        for(char x : b.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for(int rt = b.length()-1; rt < a.length(); rt++){
            map.put(a.charAt(rt), map.getOrDefault(a.charAt(rt), 0)+1);
            if(map.equals(map2)) answer++;


            map.put(a.charAt(lt), map.get(a.charAt(lt))-1);
            if(map.get(a.charAt(lt)) == 0) map.remove(a.charAt(lt));
            lt++;
        }


        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        System.out.println(T.solution(a, b));

    }
}