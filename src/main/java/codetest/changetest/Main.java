package codetest.changetest;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for(int i = 1; i < n; i++){
            if(arr[i-1] < arr[i]) answer.add(arr[i]);
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

        System.out.println(T.solution(n, arr));
    }
}