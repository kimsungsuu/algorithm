package infrenalgorithm.section04.one;

import java.util.HashMap;
import java.util.Scanner;

public class MainTwo {
    public char solution(int n, String str){
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> tmp = new HashMap<>();

        for(char t : str.toCharArray()){
             tmp.put(t,tmp.getOrDefault(t,0)+1);
        }

        for(char key : tmp.keySet()){
            if(tmp.get(key) > max){
                max = tmp.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainTwo T = new MainTwo();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        System.out.println(T.solution(n, str));
    }
}
