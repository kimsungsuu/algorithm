package infrenalgorithm.section06.five;

import java.util.Scanner;

public class My {
    public char solution(int n, int[] arr){
        char answer = 'U';

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]) return 'D';
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }

}
