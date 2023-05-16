package infrenalgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int time;
    public char state;

    public Time(int time, char state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o){
        if(this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class 결혼식_강사풀이 {

    public int solution(ArrayList<Time> arr){
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for(Time o : arr){
            if(o.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        결혼식_강사풀이 T = new 결혼식_강사풀이();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Time> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int sT = in.nextInt();
            int eT = in.nextInt();
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }

        Collections.sort(arr);
        System.out.println(T.solution(arr));
    }
}
