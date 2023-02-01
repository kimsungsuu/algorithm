package programmers.lv2;

import java.util.Scanner;

public class Rectangle {
    public long solution(int w, int h){
        long answer = w*h;





        return answer;

    }

    public static void main(String[] args) {
        Rectangle T = new Rectangle();
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();
        int h = in.nextInt();

        System.out.println(T.solution(w, h));
    }
}
