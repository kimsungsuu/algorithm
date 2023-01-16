package infrenalgorithm.section06.two;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){

       for(int i = 0; i < n-1; i++){    // 반복 횟수
           for(int j = 0; j < n-i-1; j++){ // 실질적 버블 정렬 로직!
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
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }

}

