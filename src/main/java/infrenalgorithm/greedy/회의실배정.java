package infrenalgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Discuss implements Comparable<Discuss>{
    public int s;
    public int e;

    public Discuss(int s, int e){
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Discuss o){
        return this.s - o.s;
    }
}

public class 회의실배정 {

    public int solution(ArrayList<Discuss> arr, int n){
        int answer = 1;
        Collections.sort(arr);
        for(int i = 0; i < n; i++){
            int cnt = 1;
            int temp = arr.get(i).e;
            for(int j = i+1; j < n; j++){
                if(temp <= arr.get(j).s){
                    temp = arr.get(j).e;
                    cnt++;
                }
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        회의실배정 T = new 회의실배정();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Discuss> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int s = in.nextInt();
            int e = in.nextInt();
            arr.add(new Discuss(s, e));
        }

        System.out.print(T.solution(arr, n));
    }
}
