package infrenalgorithm.dfsbfs활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    public int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 미로최단거리통로강사풀이 {
    static int[][] arr;

    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌

    public int BFS(int rL, int cL){
        Queue<Point> Q = new LinkedList<>();

        int L = 0;

        arr[rL][cL] = 1;

        Q.offer(new Point(rL,cL));

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                Point point = Q.poll();
                for(int j = 0; j < 4; j++){
                    int nx = point.x+dx[j];
                    int ny = point.y+dy[j];
                    if(nx == 7 && ny == 7) return L+1;
                    if (nx > 0 && ny > 0 && nx <= 7 && ny <= 7 && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        Q.offer(new Point(nx, ny));
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        미로최단거리통로강사풀이 T = new 미로최단거리통로강사풀이();
        Scanner in = new Scanner(System.in);

        arr = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(T.BFS(1,1));
    }
}
