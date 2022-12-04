package infrenalgorithm.test;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr){
        int answer = 1;

        int max = arr[0];

        for(int i = 1; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
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
        System.out.println(T.solution(n,arr));
    }
}
