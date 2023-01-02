package codetest.changetest;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {

    public int solution(int n, int k) {
        int answer = 0;
        int arr[] = new int[n];
        Queue<Integer> q = new LinkedList<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int x : arr) {
            q.offer(x);
        }

        while (q.size() > 1) {
            cnt++;
            if (cnt%k != 0) {
                q.offer(q.poll());
            }else{
                q.poll();
            }

        }
        answer = q.poll();
        return answer;
    }

        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            Main T = new Main();

            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(T.solution(n,k));
        }
    }