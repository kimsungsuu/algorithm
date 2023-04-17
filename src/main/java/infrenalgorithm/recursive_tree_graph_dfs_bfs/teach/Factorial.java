package infrenalgorithm.recursive_tree_graph_dfs_bfs.teach;

public class Factorial {

    public int DFS(int n){

        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        Factorial T = new Factorial();

        int n = 5;

        for(int i = 1; i <= n; i++){

            System.out.print(T.DFS(i) + " ");
        }
    }
}
