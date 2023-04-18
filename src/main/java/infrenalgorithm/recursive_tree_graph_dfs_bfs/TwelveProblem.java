package infrenalgorithm.recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

public class TwelveProblem {
    static int[][] graph;
    static int[] ch;
    static int n, m, answer = 0;

    public void DFS(int v){
        if(v == n) {
            String tmp = "1 ";
            for(int i = 2; i <= n; i++){
                if(ch[i] == 1) tmp += i + " ";
            }

            if(tmp.length() != 0) System.out.println(tmp);
        }
        else{
            for(int i = 1; i <= n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 백트래킹
                }
            }
        }

    }

    public static void main(String[] args) {
        TwelveProblem T = new TwelveProblem();
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); // 노드 개수
        m = in.nextInt(); // 간선 개수

        ch = new int[n+1];
        graph = new int[n+1][n+1];

        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;

        T.DFS(1);
    }
}
