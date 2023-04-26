package infrenalgorithm.dfsbfs활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 동전교환 {
    static int m;
    static int ch[];

    public int BFS(int[] dis){

        int L = 0;

        Queue<Integer> Q = new LinkedList<>();

        Q.offer(0);

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int x = Q.poll();
                for(int j = 0; j < dis.length; j++){
                    int nx = x+dis[j];
                    if(nx == m) return L+1;
                    if(ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return -1;
    }


    public static void main(String[] args) {
        동전교환 T = new 동전교환();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] dis = new int[n];

        for(int i = 0; i < n; i++){
            dis[i] = in.nextInt();
        }

        m = in.nextInt();

        ch = new int[501];

        System.out.println(T.BFS(dis));
    }
}
