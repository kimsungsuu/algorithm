package infrenalgorithm.section06.seven;

import java.util.Scanner;

public class My {

    public void solution(int n, int[] x, int[] y){

        for(int i = 0; i < n; i++) {
            System.out.println(x[i] + " " + y[i]);
        }
    }

    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        T.solution(n, x, y);
    }
}
