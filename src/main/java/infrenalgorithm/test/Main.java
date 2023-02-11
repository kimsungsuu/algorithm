package infrenalgorithm.test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

    public int validation(int[] arr){

        String tmp1 = "";

        int cnt = 1;

        for(int i = 0; i < arr.length; i++){
            tmp1 += arr[i];
        }

        String tmp2 = new StringBuilder(tmp1).reverse().toString();

        if(tmp1 == tmp2) return cnt;
        else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > 0) arr[i] -= 1;
                break;
            }


        }

        return cnt;
    }

    public int[] solution(int[][] queries) {
        int[] answer = new int[2];

        int n = queries.length;

        int[] arr = new int[queries[0].length];


        for(int i = 0; i < queries[0].length; i++){
            for(int j = 0; j < queries[i].length; j++){
                arr[i] = queries[i][j];
                System.out.println(arr[i]);
            }

            if(validation(arr) == 1) answer[i] = 1;
            else answer[i] = 0;

        }

        int lt = 0, rt = n-1;


        return answer;
    }

        public static void main(String[] args) {
            Main T = new Main();
            Scanner in = new Scanner(System.in);

            int[][] queries = {{2,0}, {3,1}};

            System.out.println(T.solution(queries));
        }
    }
