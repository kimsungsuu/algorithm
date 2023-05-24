package infrenalgorithm.greedy;

import java.util.Scanner;

public class 친구인가 {
    static int[] unf;

    // Find 메서드와 Union 메서드를 통해 서로 연관있는 집합을 만든다.
    public static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa!=fb) unf[fa] = fb;
    }
    public static void main(String[] args) {
        친구인가 T = new 친구인가();
        Scanner in = new Scanner(System.in);

        // 학생 수 n과 학생 쌍 m
        int n = in.nextInt();
        int m = in.nextInt();

        // unf 배열 = 서로소 집합을 구분해주는 배열이다.
        // unf 배열을 초기화 한다.
        unf = new int[n+1];
        for(int i = 1; i <= n; i++) unf[i] = i;

        // 숫자쌍 입력
        for(int i = 1; i <= m; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            // a와 b를 같은 집합으로 만든다.
            Union(a,b);
        }

        // a와 b가 친구인가?
        int a = in.nextInt();
        int b = in.nextInt();

        int fa = Find(a);
        int fb = Find(b);
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");

        for(int x : unf){
            System.out.print(x + " ");
        }
    }
}
