package infrenalgorithm.section05.six;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class My {
    public int solution(int n, int k){
        int answer = 0;

        Queue<Integer> que = new LinkedList<>();

        int cnt = 0;
        
        for(int i = 1; i <= n; i++){
            que.offer(i);
        }

        while(que.size() > 1){
            cnt++;
            if(cnt != k) que.offer(que.poll());
            else {
                que.poll();
                cnt = 0;
            }

        }

        answer = que.poll();

        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(T.solution(n, k));
    }
}
