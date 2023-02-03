package infrenalgorithm.section07.teach;

public class BinaryNumber {
    public void DFS(int n){
        String tmp = "";
        if(n / 2 == 0) tmp+=n;
        else{
            DFS(n/2);
            tmp += n%2;
        }

        System.out.print(tmp);
    }

    public static void main(String[] args) {
        BinaryNumber T = new BinaryNumber();

        T.DFS(11);
    }
}
