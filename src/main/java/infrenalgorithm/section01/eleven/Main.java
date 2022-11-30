package infrenalgorithm.section01.eleven;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";

        str = str + " ";

        int p = 1;

        for(int i = 0; i < str.length()-1; i++) {

            if(str.charAt(i) == str.charAt(i+1)) p++;
            else{
                answer += str.charAt(i);
                if(p > 1){
                    answer += String.valueOf(p);
                }
                p = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
