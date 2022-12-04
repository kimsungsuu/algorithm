package infrenalgorithm.package02.five;

import java.util.Scanner;

public class Main {

    public int solution(int n ){
        int answer = 2;

        for(int i = 4; i <= n; i++){
//            if(i%) answer++;
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
