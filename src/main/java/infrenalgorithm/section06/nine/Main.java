package infrenalgorithm.section06.nine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;

        for(int i : arr){
            if(sum + i > capacity){
                cnt++;
                sum = i;
            }
            else sum += i;
        }

        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid - 1;
            }else lt = mid + 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
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
