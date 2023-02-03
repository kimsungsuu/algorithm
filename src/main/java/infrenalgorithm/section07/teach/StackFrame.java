package infrenalgorithm.section07.teach;

import java.util.Scanner;

public class StackFrame {
    public void DFS(int n){
        if(n == 0) return;
        else{
            System.out.print(n + " ");
            DFS(n-1);
        }
    }

    public static void main(String[] args) {
        StackFrame T = new StackFrame();

        T.DFS(3);

    }
}
