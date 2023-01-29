package infrenalgorithm.section06.nine;


import java.util.Arrays;
import java.util.Scanner;

public class My {
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        int rt = 0;
        int cnt = 0;
        int sum = arr[0];

        int tmp = arr[0];
        for(int i = 0; i < n-1; i++){
            tmp += arr[i];

            while(rt < n-1){
                rt++;
                sum += arr[rt];
              if(sum == tmp) cnt++;
              if(sum > tmp) {
                  sum = arr[rt];
                  cnt++;
              }

            }



            if(cnt == m){
                answer = tmp;
                break;
            }
            cnt = 0;
        }


        return answer;
    }
    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(n, m, arr));
    }

    }
