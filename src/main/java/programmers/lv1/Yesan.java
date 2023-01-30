package programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class Yesan {
        public int solution(int[] d, int budget) {
            int answer = 0;

            Arrays.sort(d);
            int cnt = 0;

            for(int i : d){
                if(budget - i >= 0){
                    budget -= i;
                    cnt++;
                }
            }
            answer = cnt;
            return answer;
        }
        public static void main(String[] args){
            Yesan T = new Yesan();
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

