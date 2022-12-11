package infrenalgorithm.section3.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0, p2=0;

        while(p1 < n && p2 < m){
            if(a[p1] <= b[p2]){
                answer.add(a[p1]);
                p1++;
            }else{
                answer.add(b[p2]);
                p2++;
            }
        }

        if(p1 < n){
            for(int i = p1; i < n; i++){
                answer.add(a[i]);
            }
        }else if(p2 < m){
            for(int i = p2; i < m; i++){
                answer.add(b[i]);
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] b = new int[m];

        for(int i = 0; i < m; i++){
            b[i] = in.nextInt();
        }

        for(int x : T.solution(n, m, a, b)){
            System.out.print(x + " ");
        }

    }
}
