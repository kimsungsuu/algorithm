package codetest.changetest;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        int nm = 0, mm = 0;

        while(nm < n && mm < m){
            if(a[nm] <= b[mm]){
                answer.add(a[nm]);
                nm++;
            }else{
                answer.add(b[mm]);
                mm++;
            }
        }

        while(nm < n){
            answer.add(a[nm]);
            nm++;
        }

        while(mm < m){
            answer.add(b[mm]);
            mm++;
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