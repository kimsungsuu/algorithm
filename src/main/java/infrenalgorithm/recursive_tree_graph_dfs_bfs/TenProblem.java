package infrenalgorithm.recursive_tree_graph_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

class TenNode{
    int data;
    TenNode lt, rt;

    public TenNode(int val){
        data = val;
        lt = null;
        rt = null;
    }
}
public class TenProblem {
    TenNode root;

    public int BFS(TenNode root){
        Queue<TenNode> Q = new LinkedList<>();

        Q.offer(root);
        int L = 0;

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                TenNode x = Q.poll();
                if(x.lt == null && x.rt == null) return L;
                else{
                    if(x.lt != null) Q.offer(x.lt);
                    if(x.rt != null) Q.offer(x.rt);
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        TenProblem tree = new TenProblem();

        tree.root = new TenNode(1);
        tree.root.lt = new TenNode(2);
        tree.root.rt = new TenNode(3);
        tree.root.lt.lt = new TenNode(4);
        tree.root.lt.rt = new TenNode(5);

        System.out.println(tree.BFS(tree.root));
    }
}
