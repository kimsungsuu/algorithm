package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 바둑이승차 {
    static int c;
    static int n;
    static int arr[];
    static int answer;

    public void DFS(int L, int sum){
        if(sum > c) return;
        if(L == n){
            answer = Math.max(answer, sum);
        }else{
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }

    }

    public static void main(String[] args) {

        바둑이승차 T = new 바둑이승차();
        Scanner in = new Scanner(System.in);

        c = in.nextInt();
        n = in.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        T.DFS(0,0);

        System.out.println(answer);

    }
}
