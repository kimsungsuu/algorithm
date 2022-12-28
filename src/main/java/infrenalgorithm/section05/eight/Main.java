package infrenalgorithm.section05.eight;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{

    int id;
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Main {

    public int solution(int n, int m, int[] arr){
        int answer = 0;

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
            if(tmp != null){
                answer++;
                if(tmp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
