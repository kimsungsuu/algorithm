package infrenalgorithm.section04.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        int lt = 0;
        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        answer.add(map.size());

        for(int rt = k; rt < n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt], 0)+1);
            map.replace(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }
            lt++;
            answer.add(map.size());
//            System.out.println(map);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
    }
}