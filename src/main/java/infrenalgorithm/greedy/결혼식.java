package infrenalgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


    class Marry implements Comparable<Marry>{
        public int s;
        public int e;

        public Marry(int s, int e){
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Marry o){
            return this.s - o.s;
        }
    }

public class 결혼식 {

    public int solution(ArrayList<Marry> arr, int n){
        int answer = 0;
        int tempIndex = 0;

        ArrayList<Marry> result = new ArrayList<>();

        result.add(arr.get(0));

        for(int i = 1; i < n; i++){
            int temp = arr.get(tempIndex).e;
            if(temp > arr.get(i).s){
                result.add(arr.get(i));
            }else if(temp <= arr.get(i).s){
                result.add(arr.get(i));
                result.remove();
                tempIndex++;
            }

            answer = Math.max(answer, result.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        결혼식 T = new 결혼식();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Marry> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int s = in.nextInt();
            int e = in.nextInt();
            arr.add(new Marry(s, e));
        }

        Collections.sort(arr);

        System.out.println(T.solution(arr, n));

    }
}

