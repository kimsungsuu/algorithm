package infrenalgorithm.section3.two;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        //a와 b 배열을 오름차순으로 만든다.

        Arrays.sort(a);
        Arrays.sort(b);

//        for(int i = 0; i < n-1; i++){
//            for(int j = i; j < n; j++){
//                if(a[i] > a[j]){
//                    int tmp = a[i];
//                    a[i] = a[j];
//                    a[j] = tmp;
//                }
//            }
//        }
//
//        for(int i = 0; i < m - 1; i++){
//            for(int j = i; j < m; j++){
//                if(b[i] > b[j]){
//                    int tmp = b[i];
//                    b[i] = b[j];
//                    b[j] = tmp;
//                }
//            }
//        }


        //오름차순으로 정렬된 a와 b 배열이 서로 같은 값이 있을 때 그 값을 answer.add로 추가해준다.

        while(p1 < n && p2 < m){
            if(a[p1] < b[p2]){
                p1++;
            }else if(a[p1] > b[p2]){
                p2++;
            }else {
                answer.add(a[p1]);
                p1++;
                p2++;
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
