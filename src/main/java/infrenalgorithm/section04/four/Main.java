package infrenalgorithm.section04.four;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public int solution(String str, String t){
        int answer = 0;

        int lt = 0;
        int rt = t.length();

        int len = str.length();

        HashMap<Character,Integer> map = new HashMap<>();

        while(rt<=len){
            String tmp = str.substring(lt, rt);

            int cnt = t.length();

            for(char x : tmp.toCharArray()){
                map.put(x, map.getOrDefault(x, 0)+1);
            }

            for(char z : t.toCharArray()){
                if(map.containsKey(z)) {
                    cnt--;
                    map.put(z,map.get(z)-1);
                    if(map.get(z) == 0) map.remove(z);
                }
            }

            if(cnt == 0) answer++;

            map.clear();

            lt++;
            rt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String t = in.next();

        System.out.println(T.solution(str, t));

    }
}
