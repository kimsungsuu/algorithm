package infrenalgorithm.section3.four;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int pi = 0;
        int sum = 0;

//        배열을 순서대로 더하는 sum 값이 m보다 클 때 sum에서 arr[pi] 값을 제거해주고, pi를 증가시켜준다.

        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];

            if(sum == m) answer++;

            while(sum>=m) {
                sum -= arr[pi++];
                if(sum==m) {
                    answer++;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner in  = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
