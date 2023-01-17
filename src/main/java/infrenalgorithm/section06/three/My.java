package infrenalgorithm.section06.three;

import infrenalgorithm.section06.two.Main;

import java.util.Scanner;

public class My {
    public int[] solution(int n, int[] arr){

        for(int i = 1; i < n; i++){
            for(int j = i-1; j >= 0; j--){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
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
