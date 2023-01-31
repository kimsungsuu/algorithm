package programmers.lv2;

import java.util.Scanner;

public class VisitLength {
    public int solution(String dirs){
        int answer = 0;

        int[][] arr = new int[11][11];

        int x = 5, y = 5;
        int cnt = 0;
        for(char t : dirs.toCharArray()){
                if(t == 'U'){
                    if(x > 0 && x < 10){
                        x--;
                        if(arr[x][y] != 1){
                            arr[x][y] = 1;
                            cnt++;
                        }
                    }
                }else if(t == 'L'){
                    if(y > 0 && y < 10){
                        y--;
                        if(arr[x][y] != 1){
                            arr[x][y] = 1;
                            cnt++;
                        }
                    }
                }else if(t == 'R') {
                    if(y > 0 && y < 10){
                        y++;
                        if(arr[x][y] != 1){
                            arr[x][y] = 1;
                            cnt++;
                        }
                    }
                }else{
                    if(x > 0 && x < 10){
                        x++;
                        if(arr[x][y] != 1){
                            arr[x][y] = 1;
                            cnt++;
                        }
                    }
                }
            System.out.println("t = "+ t + " x = " + x + ' ' + " y =" + y + " cnt =" + cnt);

        }

        answer = cnt;


        return answer;
    }

    public static void main(String[] args) {
        VisitLength T = new VisitLength();
        Scanner in = new Scanner(System.in);

        String dirs = in.next();


        System.out.println(T.solution(dirs));
    }
}
