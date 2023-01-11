package codetest.changetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        int lt = 0;

        for(int i = 0; i < m-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int rt = m-1; rt < n; rt++){

                map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

                map.put(arr[lt], map.get(arr[lt])-1);
                if(map.get(arr[lt])==0) map.remove(map.remove(arr[lt]));
                lt++;

                answer.add(map.size());
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }


        for(int x : T.solution(n, m, arr)) System.out.print(x + " ");

    }
}