package infrenalgorithm.section06.six;

import java.util.ArrayList;
import java.util.Scanner;

public class My {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int pos = 0;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    answer.add(i+1);
                    pos = i;
                    break;
                }
            }
            if(pos != 0) break;
        }

        for(int i = 0; i < n; i++){
            if(arr[pos] < arr[i]) {
                answer.add(i);
                break;
            }
        }

        if(answer.size() == 1) answer.add(n);

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
