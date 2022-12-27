package infrenalgorithm.section05.six;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int n, int k){
        int answer = 0;

        Queue<Integer> que = new LinkedList<>();

        int cnt = 0;

        for(int i = 1; i <= n; i++){
            que.offer(i);
        }

        while(!que.isEmpty()){
            for(int i = 1; i < k; i++) que.offer(que.poll());
            que.poll();
            if(que.size()==1) answer= que.poll();
        }



        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(T.solution(n, k));
    }
}
