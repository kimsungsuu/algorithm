package codetest.changetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr){

        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    int tmp = arr[i] + arr[j] + arr[k];
                    map.put(tmp, map.getOrDefault(tmp, 0) + 1);
                }
            }
        }
        int cnt = 0;

        while(cnt != m && !map.isEmpty()){
            int tmp = 0;
            for(int x : map.keySet()){
                tmp = Math.max(tmp, x);
            }
            if(tmp != 0){
                System.out.println(map);
                map.remove(tmp);
                cnt++;
            }
            answer = tmp;
        }

        if(cnt < m){
            answer = -1;
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

        System.out.println(T.solution(n, m, arr));

    }
}