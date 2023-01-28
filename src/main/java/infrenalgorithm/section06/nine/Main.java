package infrenalgorithm.section06.nine;

import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(n, m, arr));
    }
}
