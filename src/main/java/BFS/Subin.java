package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Subin {

    public int solution(int s, int e){
        int answer = 0;
        int[] ch = new int[100001];

        Queue<Integer> Q = new LinkedList<>();

        Q.offer(s);

        ch[s] = 1;

        int L = 0;

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int x = Q.poll();
                int[] dis = {-1, 1, 2*x};
                for(int j = 0; j < 3; j++){
                    int nx = 0;
                    if(j != 2) {
                        nx = x + dis[j];
                    }else nx = x * 2;
                    if(nx == e) return L+1;
                    if(nx >= 1 && nx <= 100000 && ch[nx] == 0){
                        System.out.println("nx = " + nx + " L = " + L);
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Subin T = new Subin();
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int e = in.nextInt();

        System.out.println(T.solution(s, e));
    }
}
