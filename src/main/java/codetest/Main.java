package codetest;

import java.util.HashMap;

public class Main {
    public int solution(int[] array) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;

        for (int x : array) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if(map.get(x) > max){
                max = x;
            }
        }

        int cnt = 0;

        for(int x : map.keySet()){
            if(map.get(x) == map.get(max)){
                cnt++;
            }
        }

        if(cnt > 1){
            return -1;
        }

        answer = max;

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();

        int arr[] = {1, 1, 3, 3, 3, 4};

        System.out.println(T.solution(arr));
    }
}



