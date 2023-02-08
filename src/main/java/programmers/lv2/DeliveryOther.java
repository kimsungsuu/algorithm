package programmers.lv2;

import java.util.Scanner;

public class DeliveryOther {
    static final int INF = 500001;
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        int[][] map = new int[N + 1][N + 1];

        // 무한대로 초기화
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i==j) continue;
                map[i][j] = INF;
            }
        }

        // 간선 정보 저장 (이중 배열)
        for (int i = 0; i < road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int w = road[i][2];

            if (map[a][b] > w) {
                map[a][b] = w;
                map[b][a] = w;
            }
        }

        int[] dist = new int[N + 1];


        for (int i = 2; i <= N; i++) {
            dist[i] = (dist[i]==0) ? INF : map[1][i];
        }

        boolean[] visited = new boolean[N + 1];
        visited[1] = true;

        for (int i = 1; i <= N - 1; i++) { // dist[2] ~ dist[N]까지 돌기 때문에 N-1번이다.

            // extract-min
            int min_idx = 1;
            int min_value = INF;
            for (int j = 2; j <= N; j++) {
                // 한번도 들리지 않았고(visited == false), dist[j] 리스트에서 가장 작은 인덱스일 때 조건문을 실행
                if (!visited[j] && dist[j] < min_value) {
                    min_value = dist[j];
                    min_idx = j;
                }
            }

            //
            visited[min_idx] = true;

            // 더 빠른 간선이 존재할 때 그 간선을 저장
            for (int j = 2; j <= N; j++) {
                if (dist[j] > dist[min_idx] + map[min_idx][j]) {
                    dist[j] = dist[min_idx] + map[min_idx][j];
                }
            }
        }

        // 결과 카운트
        for (int i = 1; i <= N; i++) {
            System.out.println(dist[i]);
            if(dist[i]<=K) answer ++;
        }


        return answer;
    }

    public static void main(String[] args) {

        DeliveryOther T = new DeliveryOther();
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] road = {{1,2,1}, {2,3,3}, {5,2,2}, {1,4,2}, {5,3,1}, {5,4,2}}; //간선 집합
        int K = in.nextInt();

        System.out.println(T.solution(N, road, K));
    }
}
