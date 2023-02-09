package programmers.lv3;

import java.util.Scanner;

public class BaseStation {

    public int solution(int n, int[] station, int w){
        int answer = 0;

        int[] arr = new int[n+1];

        for(int k : station){

            for(int i = k; i <= k+w; i++){
                if(i <= n){
                    arr[i] = 1;
                }
            }

            for(int i = k-1; i >= k-w; i--){
                if(i > 0){
                    arr[i] = 1;
                }
            }
        }


        for(int i = 1; i <= n; i++){
            int cnt = 1;
            int lt = i;
            System.out.println(lt);
            if(arr[i] == 0){
                while(cnt <= w*2+1 && lt <= n){
                    if(arr[lt] == 1) break;
                    arr[lt++] = 1;
                    cnt++;
                }
                i = lt-1;
                answer++;
            }
        }
//
//        for(int i = 1; i <= n; i++){
//            System.out.print(arr[i] + " ");
//        }


        return answer;
    }



    public static void main(String[] args) {
        BaseStation T = new BaseStation();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] station = {4, 11};
        int w = in.nextInt();

        System.out.println(T.solution(n, station, w));
    }
}
