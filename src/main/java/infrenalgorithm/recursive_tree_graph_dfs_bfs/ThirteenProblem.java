package infrenalgorithm.recursive_tree_graph_dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirteenProblem {
    static int[] ch;
    static int answer;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;

    public void DFS(int val){
        if(val == n) answer++;
        else{
            for(int nx : graph.get(val)){
                if(ch[nx] == 0) {
                    ch[nx] = 1;
                    DFS(nx);
                    ch[nx] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        ThirteenProblem T = new ThirteenProblem();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

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

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
