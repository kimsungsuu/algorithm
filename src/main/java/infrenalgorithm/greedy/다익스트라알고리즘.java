package infrenalgorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class EdgeTwo implements Comparable<EdgeTwo> {

    public int dot;
    public int len;

    public EdgeTwo(int dot, int len) {
        this.dot = dot;
        this.len = len;
    }

    //pQ에서 최소가 되는 len 값을 꺼낸다
    @Override
    public int compareTo(EdgeTwo o) {
        return this.len - o.len;
    }

}

public class 다익스트라알고리즘 {

    static int[] dis;

    public void solution(ArrayList<ArrayList<EdgeTwo>> graph, int n, int k){
        // 최소 거리 비용을 구하자.
        PriorityQueue<EdgeTwo> pQ = new PriorityQueue<>();

        //1번 정점 최솟값을 0으로 초기화 시켜준다.
        pQ.offer(new EdgeTwo(k, 0));
        dis[k] = 0;

        while(!pQ.isEmpty()){
            //pQ에서 최솟값을 꺼낸다.
            EdgeTwo tmp = pQ.poll();
            //now = 1
            int now = tmp.dot;
            //nowLen = 0
            int nowLen = tmp.len;
            // now 정점의 len 값이 최솟값이 아니면 continue
            if(nowLen > dis[now]) continue;;

            //
            for(EdgeTwo ob : graph.get(now)){
                // ob 객체는 now 정점에서 갈 수 있는 모든 정점의 정보이다.
                // 그 값들 중에서 거리 비용이 더 작을 때 dis에 값을 담아주고
                // 해당 간선 정보를 pQ에 담아준다.
                if(dis[ob.dot] > nowLen + ob.len){
                    dis[ob.dot] = nowLen+ ob.len;
                    pQ.offer(new EdgeTwo(ob.dot, nowLen + ob.len));
                }
            }
        }
    }

    public static void main(String[] args) {

        다익스트라알고리즘 T = new 다익스트라알고리즘();
        Scanner in = new Scanner(System.in);

        // 핵심 : 1번 정점에서 모든 정점으로의 최소 거리 비용을 출력해야 한다

        // 일단 n과 m을 입력받자.
        int n = in.nextInt();
        int m = in.nextInt();

        /** 정점끼리의 간선 정보를 입력하자.
         */

        ArrayList<ArrayList<EdgeTwo>> graph = new ArrayList<ArrayList<EdgeTwo>>();

        // graph의 크기를 초기화 해준다.
        // ArrayList 인덱스에 접근할 수 있도록 공간을 확보해준다.
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<EdgeTwo>());
        }

        dis = new int[n+1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        // j는 간선의 수 = 9
        for(int j = 0; j < m; j++){
            int a = in.nextInt(); // 첫번 째 정점
            int b = in.nextInt(); // 두번 째 정점
            int c = in.nextInt(); // 첫번째 정점 -> 두번째 정점 거리 비용

            graph.get(a).add(new EdgeTwo(b, c));
        }

    // System.out.print(T.solution(graph, n)); solution이 void를 반환하는데 sout 메서드에 넣어서 error 발생
    // 아래와 같이 선언해야 함.
        T.solution(graph, n, 1);

        for(int i = 2; i <= n; i++){
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }
    }
}
