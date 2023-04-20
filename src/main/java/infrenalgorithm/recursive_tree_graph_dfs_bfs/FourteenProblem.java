package infrenalgorithm.recursive_tree_graph_dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FourteenProblem {
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[] dis;

    public void BFS(int val){
        Queue<Integer> Q = new LinkedList<>();

        ch[val] = 1; // 시작 정점 1로 초기화
        dis[val] = 0;

        Q.offer(val); //

        while(!Q.isEmpty()){
            int cv = Q.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    Q.offer(nv);
                    dis[nv] = dis[cv] + 1; // nv(도착 지점)는 cv(시작 지점)로부터 소요되는 거리.
                }
            }
        }


    }


    public static void main(String[] args) {
        FourteenProblem T = new FourteenProblem();
        Scanner in = new Scanner(System.in);


        n = in.nextInt();
        m = in.nextInt();

        dis = new int[n+1];

        ch = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        T.BFS(4);

        for(int i = 2; i <= n; i++){
            System.out.println(i + ":" + dis[i]);
        }
    }
}
