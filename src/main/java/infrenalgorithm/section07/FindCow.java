package infrenalgorithm.section07;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCow {
    int answer = 0;
    int[] dis = {1, -1, 5}; // dis 배열 생성 dis 배열은 현수가 이동할 수 있는 거리와 방식을 의미한다. 0번 째 일 때는 1, 1번 째 일때는 -1, 2번 째 일 때는 5만큼 움직인다.
    int[] ch; // ch는 수직선을 의미한다. 수직선상의 좌표는 1 ~ 10000까지 존재할 수 있다. 배열은 0부터 시작하므로 10001까지로 초기화해줘야 한다.

    Queue<Integer> Q = new LinkedList<>(); // Queue 방식을 사용했다. Queue 자료구조는 offer()를 통해 노드 추가, peek()을 통해 첫번 째 값 반환, poll()을 통해 첫번 째 값을 제거 시킴과 동시에 반환

    public int BFS(int s, int e){

        ch = new int[10001];
        ch[s] = 1; // S는 현수임, 현수의 위치를 1로 초기화함.
        Q.offer(s);
        int L = 0; // 현재까지 거쳐온 레벨 수 즉, 이동 횟수를 의미
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int x = Q.poll();
                for(int j = 0; j < 3; j++){
                    int nx = x+dis[j];
                    if(nx == e) return L+1;
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindCow T = new FindCow();
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(T.BFS(s, e));


    }
}
