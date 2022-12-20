package infrenalgorithm.section04.four;

import java.util.HashMap;
import java.util.Scanner;

public class MainTwo {
    public int solution(String str, String t){
        int answer = 0;

        int lt = 0;
        int rt = t.length();

        int len = str.length();

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(char key : t.toCharArray()){
            tMap.put(key, tMap.getOrDefault(key, 0) + 1);
        }

        while(rt<=len){
            String tmp = str.substring(lt, rt);

            for(char x : tmp.toCharArray()){
                map.put(x, map.getOrDefault(x, 0)+1);
            }

            if(map.equals(tMap)) answer++;

            map.clear();

            lt++;
            rt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        MainTwo T = new MainTwo();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String t = in.next();

        System.out.println(T.solution(str, t));

    }
}
