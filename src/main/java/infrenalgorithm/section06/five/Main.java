package infrenalgorithm.section06.five;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution(int n, int[] arr){
        char answer = 'U';
/**
 * 아래 코드는 해쉬맵 방법
 */
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int x : arr){
//            map.put(x, map.getOrDefault(x, 0)+1);
//        }
//
//        for(int x : map.keySet()){
//            if(map.get(x) > 1) return 'D';
//        }


        Arrays.sort(arr);

        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i+1]) return 'D';
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }

}
