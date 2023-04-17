package infrenalgorithm.recursive_tree_graph_dfs_bfs.teach;

public class Fibonacci {
    static int[] fibo;

    public int fibonacci(int n){
        if(fibo[n] > 0) return fibo[n];
        if(n == 1 || n == 2) return fibo[n] = 1;
        else return fibo[n] = fibonacci(n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();

        int n = 80;

        fibo = new int[n+1];

        T.fibonacci(n);

        for(int i = 1; i <= n; i++){
            System.out.print(fibo[i] + " ");
        }
    }
}