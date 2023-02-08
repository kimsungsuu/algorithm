package programmers.lv2;

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

public class Delivery {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;



    public void solution(int val){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(val, 0));
        dis[val] = 0;
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
    }

    public static void main(String[] args) {
        Delivery T = new Delivery();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<ArrayList<Edge>>();

        for(int i = 0; i <=n; i++){
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        T.solution(1);

        int k = 0;

        for(int i = 1; i <= n; i++){
            System.out.println(dis[i]);
            if(dis[i] <= 3) k++;
        }

        System.out.println(k);
    }
}
