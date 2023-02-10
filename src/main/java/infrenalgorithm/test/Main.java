package infrenalgorithm.test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int lt = 0;

        while(budget > 0){
            budget -= d[lt];
            lt++;
            if(budget >= 0) answer++;
        }


        return answer;
    }

        public static void main(String[] args) {
            Main T = new Main();
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }

            int budget = in.nextInt();

            System.out.print(T.solution(arr, budget));
        }
    }
