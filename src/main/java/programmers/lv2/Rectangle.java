package programmers.lv2;

import java.util.Scanner;

public class Rectangle {
    public long solution(int w, int h){
        long answer = w*h;

        int tmp = 0;

        while(w==0 && h==0){
            for(int i = 0; i < w; i++){
                if(w % i == 0) tmp += i;
            }

        }



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
