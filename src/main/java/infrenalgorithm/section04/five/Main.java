package infrenalgorithm.section04.five;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public int solution(int n, int t, int[] arr){
        int answer = -1;

        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    tSet.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt = 0;
        for(int x : tSet){
            cnt++;
            if(cnt == t) return x;

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

        System.out.println(T.solution(n, k, arr));
    }
}
