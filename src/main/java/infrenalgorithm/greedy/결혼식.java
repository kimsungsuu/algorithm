package infrenalgorithm.greedy;

import java.util.*;

class Marry implements Comparable<Marry>{
        public int s;
        public int e;

        public Marry(int s, int e){
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Marry o){
            if(this.s == o.s) return this.e - o.e;
            else return this.s - o.s;
        }
    }

public class 결혼식 {

    public int solution(Marry[] slot, int n){
        int answer = 1;

        Queue<Integer> Q = new LinkedList<>();

        Q.offer(slot[0].e);

        for(int i = 1; i < n; i++){
            while(Q.peek() <= slot[i].s) {
                Q.poll();
            }

            Q.offer(slot[i].e);
            answer = Math.max(answer, Q.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        결혼식 T = new 결혼식();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

//        ArrayList<Marry> arr = new ArrayList<>();

        Marry[] slots = new Marry[n];

        for(int i = 0; i < n; i++){
            int s = in.nextInt();
            int e = in.nextInt();
            slots[i] = new Marry(s, e);
        }

        Arrays.sort(slots);

        System.out.println(T.solution(slots, n));
    }
}

