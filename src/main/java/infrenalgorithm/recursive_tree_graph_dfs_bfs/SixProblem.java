package infrenalgorithm.recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

public class SixProblem {

    static int n;
    static int[] ch;

    public void D(int L){
        if(L == n+1){
            String tmp = "";
            for(int i = 1; i <= n; i++){
                if(ch[i] == 1) tmp += i + " ";
            }
            System.out.println(tmp);
            if(tmp.length() == 0) System.out.println("finish!");
        }else{
            ch[L] = 1;
            D(L+1);
            ch[L] = 0;
            D(L+1);
        }


    }



    public static void main(String[] args) {
        SixProblem T = new SixProblem();
        Scanner in = new Scanner(System.in);

        n = 3;

        ch = new int[n+1];

        T.D(1);
    }
}
