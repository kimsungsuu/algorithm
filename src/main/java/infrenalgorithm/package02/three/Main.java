package infrenalgorithm.package02.three;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Character> solution(int[] A, int[] B, int n) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(A[i] == 1 && B[i] == 3) answer.add('A');
            else if(A[i] == 2 && B[i] == 1) answer.add('A');
            else if(A[i] == 3 && B[i] == 2) answer.add('A');
            else if(A[i] == B[i])answer.add('D');
            else answer.add('B');
        }
        return answer;
    }

        public static void main (String[] args){
            Main T = new Main();
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                B[i] = in.nextInt();
            }

            for (char x : T.solution(A, B, n)) {
                System.out.println(x);
            }
        }
    }
