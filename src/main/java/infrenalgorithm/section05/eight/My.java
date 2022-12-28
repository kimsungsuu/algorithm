package infrenalgorithm.section05.eight;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class My {
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();






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

        System.out.println(T.solution(n, m, arr));
    }
}
