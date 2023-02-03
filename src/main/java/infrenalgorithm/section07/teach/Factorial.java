package infrenalgorithm.section07.teach;

public class Factorial {
    static int k = 1;
    public void DFS(int n){

        if(n==0) return;
        else{
            DFS(n-1);
            k *= n;
        }
    }

    public static void main(String[] args) {
        Factorial T = new Factorial();

        T.DFS(5);
        System.out.println(k);
    }
}
