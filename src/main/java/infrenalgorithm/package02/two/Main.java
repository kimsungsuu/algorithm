package infrenalgorithm.package02.two;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int n){
        int answer = 1;

        int min = arr[0];

        for(int i = 0; i < n-1; i++){
            if(min < arr[i+1]) {
                min = arr[i+1];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);


        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(arr, n));
    }
}