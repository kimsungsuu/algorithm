package infrenalgorithm.section3.six;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr){
        int answer = 0;
        int lt = 0;
        int sum = 0;
        int cnt = 0;

       for(int rt = 0; rt < n; rt++){
           if(arr[rt] == 0) cnt++;
           while(cnt > k){
               if(arr[lt] == 0) cnt--;
               lt++;
           }
           answer = Math.max(answer, rt-lt+1);
           System.out.println("rt = " + rt + " lt = " + lt + " answer = " + answer);
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
