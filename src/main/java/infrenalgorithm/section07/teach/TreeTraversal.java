package infrenalgorithm.section07.teach;

class Node{
    int data;
    Node lt, rt;

    public Node(int val){
        data = val;
        lt=rt=null;
    }

}

public class TreeTraversal {
    Node root;

    public void DFS(Node root){
        if(root == null) return; // DFS가 말단 노드까지 도착했다는 의미이므로 함수를 return;
        else{
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();


        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
