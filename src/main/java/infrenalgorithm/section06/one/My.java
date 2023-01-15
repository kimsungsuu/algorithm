package infrenalgorithm.section06.one;

import java.util.Arrays;
import java.util.Scanner;

public class My {

    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];


        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            answer[i] = arr[i];
        }



        return answer;
    }

    public static void main(String[] args){
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
