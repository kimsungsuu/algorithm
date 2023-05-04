package infrenalgorithm.dfsbfs활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로최단거리통로 {
    static int[][] arr;

    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    public int BFS(int rL, int cL){
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();

        int L = 0;

        Q1.offer(rL);
        Q2.offer(cL);

        while(!Q1.isEmpty() && !Q2.isEmpty()){
            int len = Q1.size();
            for(int i = 0; i < len; i++){
                int x = Q1.poll();
                int y = Q2.poll();
                for(int j = 0; j < 4; j++){
                    int nx = x+dx[j];
                    int ny = y+dy[j];
                    if(nx == 7 && ny == 7) return L+1;
                    if (nx > 0 && ny > 0 && nx <= 7 && ny <= 7 && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        Q1.offer(nx);
                        Q2.offer(ny);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        미로최단거리통로 T = new 미로최단거리통로();
        Scanner in = new Scanner(System.in);

        arr = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        arr[1][1] = 1;
        System.out.println(T.BFS(1,1));
    }
}
