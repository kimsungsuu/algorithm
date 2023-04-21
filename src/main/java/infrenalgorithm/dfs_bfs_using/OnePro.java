package infrenalgorithm.dfs_bfs_using;

import java.util.Scanner;

public class OnePro {
    static String answer = "NO";
    static int n, total;
    boolean flag;
    static int[] arr;

    public void DFS(int L, int sum){
        if(flag) return;
        if(sum > total/2) return;
        if(L==n){
            if(total - sum == sum){
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L+1,sum+arr[L]);
            DFS(L+1, sum);
        }
    }


    public static void main(String[] args) {

        OnePro T = new OnePro();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            total += arr[i];
        }

        T.DFS(0,0);

        System.out.println(answer);

    }
}
