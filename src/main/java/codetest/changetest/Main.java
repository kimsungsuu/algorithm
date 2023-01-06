package codetest.changetest;


import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0;
        int lt = 0, sum = 0;

        for(int rt = 0; rt <= n/2+1; rt++){
            sum += rt;

            if(sum == n) answer++;

            while(sum > n){
                sum -= lt;
                lt++;
                if(sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(T.solution(n));
    }
}