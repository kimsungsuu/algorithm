package infrenalgorithm.dfsbfs활용;

import java.util.ArrayList;
import java.util.Scanner;

class PizzaPoint{
    public int x;
    public int y;

    public PizzaPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 피자배달거리강사풀이 {

    static int n, m, len;
    static ArrayList<PizzaPoint> hs, pz;
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int s){
        if(L==m){
            int sum = 0;
            for(PizzaPoint h : hs){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y-pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i = s; i < len; i++){
                combi[L] = i; // 0,1,2,3 or 0,1,2,4와 같이 인덱스 번호가 넘어감
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        피자배달거리강사풀이 T = new 피자배달거리강사풀이();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        hs = new ArrayList<>();
        pz = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = in.nextInt();
                if(tmp == 1) hs.add(new PizzaPoint(i, j));
                if(tmp == 2) pz.add(new PizzaPoint(i, j));
            }
        }

        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.print(answer);
    }
}
