package infrenalgorithm.test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{

    public int vex;
    public int cost;

    Edge(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob){
        return this.cost - ob.cost;
    }
}
public class Main {
        static final int max = 50001;

        public int solution(int N, int[][] road, int K){
            int answer = 0 ;
            ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();

            for(int i = 0; i <= N; i++){
                graph.add(new ArrayList<Edge>());
            }

            for(int i = 0; i < road.length; i++) {
                int a = road[i][0];
                int b = road[i][1];
                int c = road[i][2];
                graph.get(a).add(new Edge(b, c));
                graph.get(b).add(new Edge(a, c));
            }

            int[] dis = new int[N+1];

            for(int i = 2; i <= N; i++) {
                dis[i] = max;
            }

            PriorityQueue<Edge> pQ = new PriorityQueue<>();
            pQ.offer(new Edge(1, 0));
            while(!pQ.isEmpty()){
                Edge tmp = pQ.poll();
                int now = tmp.vex;
                int nowCost = tmp.cost;
                if(nowCost>dis[now]) continue;
                for(Edge ob : graph.get(now)){
                    if(dis[ob.vex] > nowCost+ob.cost){
                        dis[ob.vex] = nowCost+ob.cost;
                        pQ.offer(new Edge(ob.vex, nowCost+ ob.cost));
                    }
                }

            }

            for(int i = 1; i <= N; i++) {
                System.out.println(dis[i]);
                if(dis[i] <= K) answer++;
            }

            return answer;
        }

        public static void main(String[] args) {
            Main T = new Main();
            Scanner in = new Scanner(System.in);

            int N = in.nextInt();
            int[][] road = {{1,2,1}, {2,3,3}, {5,2,2}, {1,4,2}, {5,3,1}, {5,4,2}}; //간선 집합
            int K = in.nextInt();



            System.out.println(T.solution(N, road, K));
        }
    }
