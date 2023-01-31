package programmers.lv2;

import java.util.Scanner;

public class VisitLengthOther {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    public int solution(String dirs){
        int answer = 0;


        int x = 5, y = 5;
        boolean[][][] visit = new boolean[11][11][4];

        for(char t : dirs.toCharArray()){
            int d = 0;
            if(t=='U') d = 0;
            else if(t=='L') d = 1;
            else if(t=='D') d = 2;
            else d = 3;

            int nx = x + dx[d]; // 이동이 적용된 인덱스 위치 값
            int ny = y + dy[d];

            if(nx < 0 || ny < 0 || nx >= 11 || ny >= 11) continue;
            if(!visit[nx][ny][d]){
                visit[nx][ny][d] = true;
                d = (d%2==0) ? 2-d : 4-d;
                visit[x][y][d] = true;
                answer++;
            }
            x = nx;
            y = ny;
        }

        return answer;
    }


}
