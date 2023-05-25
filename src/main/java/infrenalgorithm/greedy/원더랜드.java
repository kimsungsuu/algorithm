package infrenalgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EdgeThree implements Comparable<EdgeThree>{
    public int v1;
    public int v2;
    public int len;

    public EdgeThree(int v1,int v2, int len){
        this.v1 = v1;
        this.v2 = v2;
        this.len = len;
    }

    @Override
    public int compareTo(EdgeThree o){
        return this.len - o.len;
    }
}



public class 원더랜드 {

    static int[] unf;

    public static int Find(int v){
        if(v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa] = fb;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int e = in.nextInt();

        unf = new int[v+1];

        ArrayList<EdgeThree> arr = new ArrayList<>();


        for(int i = 1; i <= v; i++) unf[i] = i;
        for(int i = 0; i < e; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            arr.add(new EdgeThree(a, b, c));
        }
        Collections.sort(arr);
        int answer = 0;
        int cnt = 0;
        for(EdgeThree ob : arr){
            // 유니온 a, b 해본 뒤에 서로 집합 상태가 아니라면 연결하고 answer += len을 누적하고
            // 만약 서로 집합상태라면 다음 loop를 돌면된다.
            // 그런데 서로 집합상태인걸 어떻게 판단할 수 있을까?
            // 아래와 같이 선언해서 해결한다.
            // 만약 fv1과 fv2가 서로 일치한다면 서로 이미 같은 집합에 존재한다는 의미이므로
            // 다음 loop 문으로 돌려줘야 한다.
            // 여기에서 find는 서로 같은 집합인지를 묻고 있다.
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if(fv1 != fv2) {
                answer += ob.len;
                // 서로 다른 집합이었는데 연결되어있으므로 같은 집합으로 변경
                Union(ob.v1, ob.v2);
                cnt++;
                // 트리의 간선 갯수는 최대 n-1개 이므로 트리가 완성되었을 때 불필요한 로직 수행을 방지.
                if(cnt == v-1) break;
            }
        }
        System.out.println(answer);
    }
}
