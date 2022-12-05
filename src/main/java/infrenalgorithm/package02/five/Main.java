package infrenalgorithm.package02.five;

import java.util.Scanner;

public class Main {

    public int solution(int n ){
        int answer = 0;

        int[] arr = new int[n+1];

        for(int i = 2; i < n+1; i++){
            if(arr[i]!=1) answer++;
            for(int j = i; j < n+1; j+=i){
                if(arr[j]%i==0) arr[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(T.solution(n));
    }
}
