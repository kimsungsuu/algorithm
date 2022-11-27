package infrenalgorithm.section01;

import java.util.Scanner;

public class One {

    public int solution(String str, char t){
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char c : str.toCharArray()){
            if(c == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        One T = new One();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        System.out.println(T.solution(str, t));
    }
}
