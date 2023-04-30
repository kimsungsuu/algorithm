package infrenalgorithm.dfsbfs활용;

import java.util.Scanner;

public class 수열추측하기 {
    int fibo[][] = new int[12][12];
    static int[] p, b, ch;
    static int n, total;
    boolean flag;

    public int pDFS(int n, int k) {
        if (fibo[n][k] > 0) return fibo[n][k];
        if (n == k || k == 0) return 1;
        else return fibo[n][k] = pDFS(n - 1, k - 1) + pDFS(n - 1, k);
    }

    public void bDFS(int L) {
        if (flag) return;
        if (L == n) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += p[i] * b[i];
            }
            if (sum == total) {
                for (int x : b) System.out.print(x + " ");
                System.out.println();
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    b[L] = i;
                    bDFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        수열추측하기 T = new 수열추측하기();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        total = in.nextInt();

        p = new int[n];
        b = new int[n];
        ch = new int[n + 1];

        for (int k = 0; k < n; k++) {
            p[k] = T.pDFS(n - 1, k);
        }

        T.bDFS(0);
    }
}
