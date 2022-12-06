package infrenalgorithm.package02.eight;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        int cnt;

        for(int i = 0; i < n-1; i++){
            cnt = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] < arr[j]){
                    cnt++;
                    answer[i] = cnt;
                }else{
                    answer[i] = cnt;
                }
            }

            if(i >= 1){
                for(int k = i-1; k >= 0; k--)
                {
                    if(arr[i] < arr[k]){
                        cnt++;
                        answer[i] = cnt;
                    }
                    else{
                        answer[i] = cnt;
                    }
                }
            }
        }

        cnt = 1;

        for(int i = n-1; i>=n-1; i--){
            for(int j = i-1; j >= 0; j--){
                if(arr[i] < arr[j]){
                    cnt++;
                    answer[i] = cnt;
                }else{
                    answer[i] = cnt;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
        }
    }
