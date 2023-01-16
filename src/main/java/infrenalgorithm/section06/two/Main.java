package infrenalgorithm.section06.two;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){



        for(int i = 0; i < n; i++){
            int idx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }



        return arr;
    }

    public static void main(String[] args){
        infrenalgorithm.section06.one.Main T = new infrenalgorithm.section06.one.Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }

}
