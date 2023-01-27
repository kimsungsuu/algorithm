package infrenalgorithm.section06.eight;

import java.util.Arrays;
import java.util.Scanner;

public class My {
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(arr[i] == m) {
                answer =  i+1;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(n, m, arr));
    }
}
