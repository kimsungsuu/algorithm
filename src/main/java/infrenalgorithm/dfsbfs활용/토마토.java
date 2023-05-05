package infrenalgorithm.dfsbfs활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TomatoPoint{
    public int x,y;
    
    public TomatoPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class 토마토 {

    static int[][] arr;

    static int n,m;
    int[] dx = {-1, 0, 1, 0}; //상,우,하,좌
    
    int[] dy = {0, 1, 0, -1}; //상,우,하,좌
    
    public int BFS(){
        Queue<TomatoPoint> Q = new LinkedList<>();

        int L = 0;

        int cnt = 0;

        //arr[i][j]에 0이 존재하는지 확인한다. 만약 존재한다면 cnt를 증가시킨다.
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    cnt++;
                    break;
                }
            }
            if(cnt != 0) break;
        }

        // 처음부터 모든 토마토가 익은 경우 0을 반환
        if(cnt == 0) return 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1){
                    Q.offer(new TomatoPoint(i, j));
                }
            }
        }

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                TomatoPoint tomatoPoint = Q.poll();
                for(int j = 0; j < 4; j++){
                    int nx = tomatoPoint.x+dx[j];
                    int ny = tomatoPoint.y+dy[j];
                    if(nx >= 0 && ny >=0 && nx < m && ny < n && arr[nx][ny] == 0){
                        arr[nx][ny] = 1;
                        Q.offer(new TomatoPoint(nx, ny));
                    }
                }
            }
            L++;
        }

//         모든 토마도가 익지 않은 경우 return -1
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    return -1;
                }
            }
        }

        return L-1;
    }

    public static void main(String[] args) {
        토마토 T = new 토마토();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
 
        System.out.println(T.BFS());
    }
}
