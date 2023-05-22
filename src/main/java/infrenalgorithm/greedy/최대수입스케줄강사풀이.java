package infrenalgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class LectureTwo implements Comparable<LectureTwo> {
    public int money;
    public int date;

    public LectureTwo(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(LectureTwo o) {
        return o.date - this.date;
    }
}

public class 최대수입스케줄강사풀이 {


    public int solution(ArrayList<LectureTwo> arr, int max, int n) {

        int answer = 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).date < i) break;
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        최대수입스케줄강사풀이 T = new 최대수입스케줄강사풀이();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<LectureTwo> arr = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            if(max < b) max = b;

            arr.add(new LectureTwo(a, b));
        }

        Collections.sort(arr);

        System.out.println(T.solution(arr, max, n));

    }
}
