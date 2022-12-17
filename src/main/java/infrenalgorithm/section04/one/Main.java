package infrenalgorithm.section04.one;

import java.util.Scanner;

public class Main {

    public char solution(int n, String str){
        char answer = ' ';
        int min = Integer.MIN_VALUE;
        char[] c = str.toCharArray();

        for(char t : c){
            int cnt = 0;
            for(int i = 0; i < str.length(); i++){
                if(c[i] == t) cnt++;
            }
            if(min < cnt){
                min = cnt;
                answer = t;
            }
        }

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
