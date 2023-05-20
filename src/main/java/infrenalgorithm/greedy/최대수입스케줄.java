package infrenalgorithm.greedy;

import java.util.*;

class Lecture implements Comparable<Lecture>{
    public int m;
    public int d;

    public Lecture(int m, int d){
        this.m = m;
        this.d = d;
    }

    @Override
    public int compareTo(Lecture o){
        if(this.d == o.d) return o.m - this.m;
        else return o.d - this.d;
    }
}

public class 최대수입스케줄 {
    static int max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr, int n){
        int answer = 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        pQ.offer(arr.get(0).m);

        int tmp = arr.get(0).d;
        int cnt = 0;

        for(int i = 1; i < n; i++){
            if(tmp == arr.get(i).d){
                if(i == n-1){
                    pQ.offer(arr.get(i).m);
                    answer += pQ.poll();
                    return answer;
                }
                pQ.offer(arr.get(i).m);
            }else{
                answer += pQ.poll();
                pQ.offer(arr.get(i).m);
                cnt++;
            }
            tmp = arr.get(i).d;
        }

        return -1;
    }
    public static void main(String[] args) {
        최대수입스케줄 T = new 최대수입스케줄();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Lecture> arr = new ArrayList<>();


        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            int d = in.nextInt();

            if(max < d){
                max = d;
            }

            arr.add(new Lecture(m, d));
        }

        Collections.sort(arr);

        System.out.println(T.solution(arr, n));
    }
}
