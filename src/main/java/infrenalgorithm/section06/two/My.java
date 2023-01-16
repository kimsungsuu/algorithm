package infrenalgorithm.section06.two;

import java.util.Scanner;

/**
 * Time Limit Exceeded 로직
 */
public class My {
    public int[] solution(int n, int[] arr){

        for(int i = 0; i < n-i; i++){
            while(i != n-1) {
                if (arr[i] > arr[i + 1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }


        return arr;
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
