package infrenalgorithm.section07.teach;

import java.util.LinkedList;
import java.util.Queue;

class NodeTwo{
    int data;
    NodeTwo lt, rt;
    public NodeTwo(int val){
        data = val;
        lt=rt=null;
    }
}

public class BFS {
    NodeTwo root;

    public void BFS(NodeTwo root){
        Queue<NodeTwo> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; i++){
                NodeTwo cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS tree = new BFS();

        tree.root = new NodeTwo(1);
        tree.root.lt = new NodeTwo(2);
        tree.root.rt = new NodeTwo(3);
        tree.root.lt.lt = new NodeTwo(4);
        tree.root.lt.rt = new NodeTwo(5);
        tree.root.rt.lt = new NodeTwo(6);
        tree.root.rt.rt = new NodeTwo(7);
        tree.BFS(tree.root);

    }

}
