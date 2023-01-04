package codetest.changetest;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    class Person{
        int num;
        int priority;

        public Person(int num, int priority){
            this.num = num;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] arr){
        int answer = 1;

        Queue<Person> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            q.offer(new Person(i, arr[i]));
        }


        while(!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(x.priority > tmp.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                if (tmp.num == m) return answer;
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}