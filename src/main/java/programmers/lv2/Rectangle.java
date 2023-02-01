package programmers.lv2;

import java.util.Scanner;

public class Rectangle {
    public long solution(int w, int h){
        long answer = 0;

        long lw = w;
        long lh = h;

        long tmp = 0;


        if(lw == 1 || lh ==1) return 0;


            if (lw > lh) {
                tmp = gcd(lw, lh);
            } else if (lw < lh) {
                tmp = gcd(lh, lw);
            } else {
                return lw * lh - lh;
            }


        answer = lw * lh - (lw + lh - tmp);

        return answer;

    }

    // gcd는 greatest common divisor라는 의미로 최대 공약수를 줄인말이다.
    public long gcd(long big, long small){


            while(big % small != 0 && small != 0){
                long tmp = big % small;
                big = small;
                small = tmp;
            }

        return small;
    }

    public static void main(String[] args) {
        Rectangle T = new Rectangle();
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();
        int h = in.nextInt();

        System.out.println(T.solution(w, h));
    }
}
