package codetest.changetest;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution(int n, String str){
        char answer = ' ';

        HashMap<Character, Integer> tmp = new HashMap<>();

        System.out.println(tmp.containsKey('A'));

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        System.out.println(T.solution(n, str));
    }
}
