package infrenalgorithm.section06.four;

import java.util.Scanner;

public class My {
    public int[] solution(int n, int k, int[] arr){
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){
                if(answer[j] == arr[i]){
                    answer[0] = answer[j];
                    answer[j] = 0;
                }else{
//                    answer[]
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
    }
}
