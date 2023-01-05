package codetest.changetest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int lt = 0, rt = 0;

        while(lt < n && rt < m){
            if(a[lt] < b[rt]) lt++;
            else if(a[lt] > b[rt]) rt++;
            else {
                answer.add(a[lt]);
                lt++;
                rt++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

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


        for(int x : T.solution(n, m, a, b)) System.out.print(x + " ");

    }
}