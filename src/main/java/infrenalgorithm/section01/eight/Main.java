package infrenalgorithm.section01.eight;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
