package infrenalgorithm.section04.two;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String a, String b){
        String answer = "YES";

        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        for(char x : a.toCharArray()){
            aMap.put(x, aMap.getOrDefault(x,0)+1);
        }

        for(char z : b.toCharArray()){
            bMap.put(z, bMap.getOrDefault(z,0)+1);
        }

        for(char key : aMap.keySet()){
            if(aMap.get(key) != bMap.get(key)) return "NO";
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        System.out.println(T.solution(a, b));
    }
}
