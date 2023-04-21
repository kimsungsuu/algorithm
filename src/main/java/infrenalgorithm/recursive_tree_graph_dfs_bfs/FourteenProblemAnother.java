package infrenalgorithm.recursive_tree_graph_dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FourteenProblemAnother {
    static int[] ch;
    static int[][] graph;
    static int n, m;
    static int[] dis;

    public void BFS(int val){
        Queue<Integer> Q = new LinkedList<>();

        ch[val] = 1; // 시작 정점 1로 초기화

        Q.offer(val); //

        while(!Q.isEmpty()){
            int cv = Q.poll();
            for(int i = 1; i <= n; i++){
                if(ch[i] == 0 && graph[cv][i] == 1){
                    ch[i] = 1;
                    Q.offer(i);
                    dis[i] = dis[cv] + 1; // nv(도착 지점)는 cv(시작 지점)로부터 소요되는 거리.
                }
            }
        }


    }


    public static void main(String[] args) {
        FourteenProblemAnother T = new FourteenProblemAnother();
        Scanner in = new Scanner(System.in);


        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n+1][n+1];

        ch = new int[n+1];


        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            graph[a][b] = 1;
        }

        T.BFS(1);

        for(int i = 2; i <= n; i++){
            System.out.println(i + ":" + dis[i]);
        }
    }
}
