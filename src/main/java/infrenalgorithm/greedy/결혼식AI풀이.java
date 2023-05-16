package infrenalgorithm.greedy;
import java.util.*;

class TimeSlot implements Comparable<TimeSlot> {
    public int s;
    public int e;

    public TimeSlot(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(TimeSlot o) {
        if (this.s == o.s) return this.e - o.e;
        else return this.s - o.s;
    }
}
public class 결혼식AI풀이 {
    public int solution(TimeSlot[] slots, int n) {
        int answer = 1; // 첫 번째 참석자를 고려하여 1로 초기화

        Arrays.sort(slots);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(slots[0].e);

        for (int i = 1; i < n; i++) {
            while (!pq.isEmpty() && pq.peek() <= slots[i].s) {
                pq.poll();
            }

            pq.offer(slots[i].e);
            answer = Math.max(answer, pq.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        결혼식AI풀이 marriage = new 결혼식AI풀이();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        TimeSlot[] slots = new TimeSlot[n];

        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            slots[i] = new TimeSlot(s, e);
        }

        System.out.println(marriage.solution(slots, n));
    }
}