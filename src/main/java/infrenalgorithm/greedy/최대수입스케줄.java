package infrenalgorithm.greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Recture implements Comparable<Recture>{
    public int m;
    public int d;

    public Recture(int m, int d){
        this.m = m;
        this.d = d;
    }

    @Override
    public int compareTo(Recture o){
        if(this.d == d) return o.m - this.m;
        else return o.d - this.d;
    }
}

public class 최대수입스케줄 {

    public int solution(Recture[] arr, int n){
        int answer = 0;

        PriorityQueue<Recture> pQ = new PriorityQueue<>();

        for(Recture x : arr){
            pQ.offer(x);
        }

        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(pQ.peek().d > pQ.size()){
            }else{
                cnt++;
                max = pQ.peek().d;
            }
            pQ.poll();
            if(cnt == )
        }

        return answer;
    }
    public static void main(String[] args) {
        최대수입스케줄 T = new 최대수입스케줄();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Recture[] arr = new Recture[n];

        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            int d = in.nextInt();

            arr[i] = new Recture(m, d);
        }

        Arrays.sort(arr);

        System.out.println(T.solution(arr, n));
    }
}
