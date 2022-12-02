package infrenalgorithm.package02.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int[] k, int n){
        ArrayList<Integer> answer = new ArrayList<>();

        k[0] = 0;


        for(int i = 0; i < k.length-1; i++){
            if(k[i] < k[i+1]) answer.add(k[i+1]);

        }

        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int[] k = new int[n+1];

        for(int i = 1; i < n+1; i++){
            k[i] = in.nextInt();
        }


        for(int x : T.solution(k, n)){
            System.out.print(x + " ");
        }

    }
}
