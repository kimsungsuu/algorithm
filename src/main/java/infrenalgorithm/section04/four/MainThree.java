package infrenalgorithm.section04.four;

import java.util.HashMap;
import java.util.Scanner;

public class MainThree {
    public int solution(String str, String t){
        int answer = 0;

        int lt = 0;

        int len = str.length();
        String tmp = str.substring(lt, t.length()-1);

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(char key : t.toCharArray()){
            tMap.put(key, tMap.getOrDefault(key, 0) + 1);
        }

        for(char key : tmp.toCharArray()){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for(int rt = t.length()-1; rt < str.length(); rt++){
            map.put(str.charAt(rt), map.getOrDefault(str.charAt(rt), 0)+1);

            if(tMap.equals(map)) answer++;

//            System.out.println(map);

            map.put(str.charAt(lt), map.get(str.charAt(lt))-1);

            if(map.get(str.charAt(lt)) == 0) map.remove(str.charAt(lt));

            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        MainThree T = new MainThree();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String t = in.next();

        System.out.println(T.solution(str, t));

    }

}
