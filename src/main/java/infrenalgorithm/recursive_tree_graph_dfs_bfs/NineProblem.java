package infrenalgorithm.recursive_tree_graph_dfs_bfs;

class NineNode{
    int data;
    NineNode lt, rt;

    public NineNode(int val){
        data = val;
        lt = null;
        rt = null;
    }
}
public class NineProblem {
    NineNode root;

    public int DFS(int L, NineNode root){
        if(root.lt == null && root.rt == null) return L;
        else{
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        NineProblem tree = new NineProblem();

        int L = 0;

        tree.root = new NineNode(1);
        tree.root.lt = new NineNode(2);
        tree.root.rt = new NineNode(3);
        tree.root.lt.lt = new NineNode(4);
        tree.root.lt.rt = new NineNode(5);

        System.out.println(        tree.DFS(L, tree.root));
    }
}
