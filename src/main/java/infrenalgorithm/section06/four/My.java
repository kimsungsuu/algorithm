package infrenalgorithm.section06.four;

import java.util.Scanner;

public class My {
    public int[] solution(int n, int k, int[] arr){
        int[] answer = new int[n];

        for(int x : arr){
            int pos = -1;
            for(int i = 0; i < n; i++) if(x == answer[i]) pos = i;

            if(pos == -1){
                for(int i = n-1; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }else{
                for(int i = pos; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }
            answer[0] = x;
        }

        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[k];

        for(int i = 0; i < k; i++){
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
    }
}
