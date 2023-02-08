package programmers.lv3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberGame {
    public int solution(int[] A, int[] B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int lt=0;

        for(int rt = 0; rt < B.length; rt++){
            if(B[rt] > A[lt]) {
                answer++;
                lt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        NumberGame T = new NumberGame();
        Scanner in = new Scanner(System.in);


        int[] A = {5, 1, 3, 7};
        int[] B = {2, 2, 6, 8};

        System.out.println(T.solution(A, B));
    }
}
