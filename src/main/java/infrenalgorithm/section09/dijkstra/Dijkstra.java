package infrenalgorithm.section09.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{

    public int vex; //정점 번호
    public int cost; //비용(간선의 가중치 값)

    Edge(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob){
        return this.cost-ob.cost; // 오름차순, 가장 작은 값을 우선으로 pQ에서 poll() 시켜준다.
    }
}

public class Dijkstra {

    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public void solution(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll(); // pQ 리스트 내에서 cost 값이 가장 작은 값을 poll() 시켜준다.
            int now = tmp.vex; // 현재 정점 위치
            int nowCost = tmp.cost; // 현재 정점의 가중치
            if(nowCost>dis[now]) continue; //dis에 저장돼야 하는 값은 최솟값이다. 그런데 그 값보다 더 큰 값이 들어올 필요는 없으므로 continue 해준다.
            for(Edge ob : graph.get(now)){ //graph.get(now)는 now 정점에서 다른 정점으로 가는 간선들의 집합이라고 생각하면 된다. 예를 들어 now가 3이라면 graph(3)에는 (4, 5)라는 값이 들어 있을 것이다.
                if(dis[ob.vex] > nowCost+ob.cost){ // 현재 정점의 가중치보다 더 낮은 가중치 값을 갖는 간선이 존재한다면
                    dis[ob.vex] = nowCost+ob.cost; // 현재 정점에 더 낮은 가중치 간선 값을 넣는다. 예를 들어 ob.vex가 4라고 가정했을 때, ob.vex로 가는 더 낮은 가중치 값을 dis[ob.vex]에 담아주는 것이다.
                    pQ.offer(new Edge(ob.vex, nowCost+ob.cost)); // pQ에도 최소 가중치 값을 넣는다.

                }
            }
        }
    }

    public static void main(String[] args) {
        Dijkstra T = new Dijkstra();
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); //정점 개수
        m = in.nextInt(); //간선 개수

        graph = new ArrayList<ArrayList<Edge>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0; i < m; i++){ //간선 입력
            int a = in.nextInt(); // 정점 a
            int b = in.nextInt(); // 정점 b
            int c = in.nextInt(); // 정점 a -> b로 가는 가중치 값
            graph.get(a).add(new Edge(b, c)); // graph 리스트에 a -> b로 가는 간선을 추가.
        }
        T.solution(1); //1번 정점에서 출발
        for(int i = 2; i <= n; i++){
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i+ " : " +dis[i]);
            else System.out.println(i + " : impossible");
        }
    }
}
