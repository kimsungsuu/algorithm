package programmers.lv3;

import java.util.Arrays;
import java.util.Scanner;

public class BaseStation {

    public int solution(int n, int[] station, int w){
        int answer = 0;

        Arrays.sort(station);

        int leftStart = 1;

        int tmp = w*2+1;

        for(int k : station){
            if(leftStart < k - w) {
                int leftEnd = k - w;

                int length = leftEnd - leftStart;

                int count = length / tmp;
                if (length % tmp != 0) count++;

                answer += count;
            }

            leftStart = k + w + 1;

        }

        if(station[station.length-1] + w + 1 <= n){
            leftStart = station[station.length-1] + w + 1;
            int leftEnd = n+1;

            int length = leftEnd - leftStart;

            int count = length / tmp;
            if(length % tmp != 0) count++;

            answer += count;
        }

        return answer;
    }



    public static void main(String[] args) {
        BaseStation T = new BaseStation();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] station = {4, 11};
        int w = in.nextInt();

        System.out.println(T.solution(n, station, w));
    }
}
