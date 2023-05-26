package infrenalgorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class City implements Comparable<City> {
    public int v1;
    public int len;

    public City(int v1, int len) {
        this.len = len;
        this.v1 = v1;
    }

    @Override
    public int compareTo(City o) {
        return this.len - o.len;
    }
}

public class 원더랜드프림 {

    static int[] ch;

    public int solution(ArrayList<ArrayList<City>> arr) {
        int answer = 0;
        PriorityQueue<City> pQ = new PriorityQueue<>();

        pQ.offer(new City(1, 0));

        while (!pQ.isEmpty()) {
            City tmp = pQ.poll();

            //다음 간선으로 이동한적이 없을 때
            if (ch[tmp.v1] == 0) {
                // 다음 간선으로 이동했다고 체크
                ch[tmp.v1] = 1;
                // 그 간선 정보를 더한다.
                answer += tmp.len;

                // 현재 정점 -> 다음 정점 간선 pQ에 저장
                for (City ob : arr.get(tmp.v1)) {
                    pQ.offer(ob);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        원더랜드프림 T = new 원더랜드프림();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<ArrayList<City>> arr = new ArrayList<ArrayList<City>>();

        // 무방향 그래프이므로 n*2로 설정
        for (int i = 1; i <= n*2; i++) {
            arr.add(new ArrayList<City>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            arr.get(a).add(new City(b, c));
            //무방향 그래프이므로 반대 간선도 추가해준다.
            arr.get(b).add(new City(a, c));
        }

        ch = new int[n + 1];

        System.out.println(T.solution(arr));
    }
}
