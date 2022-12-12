package infrenalgorithm.section3.three;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 슬라이딩 윈도우(sliding window)
 */
public class Main {

    public int solution(int n, int k, int[] arr){
        int answer = 0;

        int sum = 0;
        int min = Integer.MIN_VALUE;
        int pi = 0;
        int pj = k;

        //arr[0]~ arr[k-1]까지 더한 값을 sum에 담아준다.
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        min = sum;

        while(pi < n-k){
            sum = sum - arr[pi] + arr[pj];
            pi++;
            pj++;

            min = Math.max(sum, min);
        }
        answer = min;

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
