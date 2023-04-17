package infrenalgorithm.recursive_tree_graph_dfs_bfs.one;

import java.util.Scanner;

public class My {
    public int[] solution(int n){
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            answer[i] = i+1;
        }

        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i : T.solution(n)) System.out.print(i + " ");
    }
}
