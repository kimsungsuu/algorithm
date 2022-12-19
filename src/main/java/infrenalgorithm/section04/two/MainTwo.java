package infrenalgorithm.section04.two;

import java.util.HashMap;
import java.util.Scanner;

public class MainTwo {
    public String solution(String a, String b){
        String answer = "YES";

        HashMap<Character, Integer> aMap = new HashMap<>();

        for(char x : a.toCharArray()){
            aMap.put(x, aMap.getOrDefault(x,0)+1);
        }

        for(char key : b.toCharArray()){
            if(!aMap.containsKey(key) || aMap.get(key)==0) return "NO";
            aMap.put(key, aMap.get(key)-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MainTwo T = new MainTwo();
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        System.out.println(T.solution(a, b));
    }
}
