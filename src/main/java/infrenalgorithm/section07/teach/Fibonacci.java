package infrenalgorithm.section07.teach;

public class Fibonacci {

    public int fibonacci(int n){

        if(n == 1 || n == 2) return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();

        int n = 10;
        for(int i = 1; i <= n; i++){
            System.out.print(T.fibonacci(i) + " ");
        }
    }
}
