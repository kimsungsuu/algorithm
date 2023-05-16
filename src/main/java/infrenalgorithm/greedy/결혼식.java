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

    public int solution(ArrayList<Marry> arr, int n){
        int answer = 0;

        Queue<Marry> Q = new LinkedList<>();

        Q.offer(arr.get(0));

        Marry temp = Q.peek();

        for(int i = 1; i < n; i++){
            if(temp.e > arr.get(i).s){
                Q.offer(arr.get(i));
            }else if(temp.e <= arr.get(i).s){
                Q.add(arr.get(i));
                while(temp.e > Q.peek().e){
                    Q.poll();
                }
                temp = Q.peek();
            }

            answer = Math.max(answer, Q.size());
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

