package infrenalgorithm.section01.ten;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int[] solution(String str, char c){
        int len = str.length();
        int[] answer = new int[len];

        int p = 1000;

        for(int i = 0; i < len; i++) {
            if(str.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }

        }

        p=1000;

        for(int i = len-1; i >= 0; i--){

            if(str.charAt(i) == c) p =0;
            else{
                p++;
                answer[i] = Math.min(answer[i], p); // Math
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int x : t.solution(str, c)){
            System.out.print(x + " ");
        }

    }
}
