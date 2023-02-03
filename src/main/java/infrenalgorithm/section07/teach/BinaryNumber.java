package infrenalgorithm.section07.teach;

public class BinaryNumber {
    public void DFS(int n){
        String tmp = "";
        if(n== 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }

        System.out.print(tmp);
    }

    public static void main(String[] args) {
        BinaryNumber T = new BinaryNumber();

        T.DFS(11);
    }
}
