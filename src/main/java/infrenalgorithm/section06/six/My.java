package infrenalgorithm.section06.six;

import java.util.ArrayList;
import java.util.Scanner;

public class My {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int pos = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]) {
                answer.add(i+1);
                pos = i;
                break;
            }
        }

        System.out.println(arr[pos]);

        for(int i = 0; i < n-1; i++){
            if(arr[pos] <= arr[i+1]){
                answer.add(i+1);
                break;
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

        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
