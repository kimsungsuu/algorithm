package infrenalgorithm.recursive_tree_graph_dfs_bfs;

class Node{
    char data;
    Node lt, rt;

    public Node(char val){
        data = val;
        lt = null;
        rt = null;
    }
}

public class FiveNum {
    Node root;
    public void DFS(Node root){
        if(root == null) return;
        else{
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        FiveNum tree = new FiveNum();

        tree.root = new Node('A');
        tree.root.lt = new Node('B');
        tree.root.rt = new Node('C');
        tree.root.lt.lt = new Node('D');
        tree.root.lt.rt = new Node('E');
        tree.root.rt.lt = new Node('F');
        tree.root.rt.rt = new Node('G');

        tree.DFS(tree.root);
    }
}
