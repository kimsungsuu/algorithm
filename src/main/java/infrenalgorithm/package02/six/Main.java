package infrenalgorithm.package02.six;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public boolean isPrime(int res){
        if(res == 1) return false;
        for(int i = 2; i < res; i++){
            if(res%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int[] arr, int n){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res * 10+ t;
                tmp /= 10;
            }
            if (isPrime(res) == true) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(arr, n)){
            System.out.print(x + " ");
        }
    }
}
