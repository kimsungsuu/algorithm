package hello.algorithm.dynamicprogramming;
import java.io.*;
import java.util.Scanner;

public class DpTen {
    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

//        int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    }
}
