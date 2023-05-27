package infrenalgorithm.다이나믹프로그래밍;

import java.util.Scanner;

public class 계단오르기 {
    static int[] dis;
    public int solution(int n){
        dis[1] = 1;
        dis[2] = 2;

        for(int i = 3; i <= n; i++){
            dis[i] = dis[i-2] + dis[i-1];
        }

        return dis[n];
    }
    public static void main(String[] args) {
     계단오르기 T = new 계단오르기();
     Scanner in = new Scanner(System.in);

     int n = in.nextInt();
     dis = new int[n+1];

        System.out.println(T.solution(n));
    }
}
