package programmers.lv1;

import java.util.Scanner;

public class MakeSosu {

    public boolean validation(int num){

        if(num < 2) return false;
        if(num == 2) return true;
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public int solution(int[] nums) {
        int answer = -1;

        int cnt = 0;

        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(k != 0) {
                        int tmp = nums[i] + nums[j] + nums[k];
                        if(validation(tmp)) cnt++;
                    }
                }
            }
        }

        answer = cnt;

        return answer;
    }

    public static void main(String[] args) {
        MakeSosu T = new MakeSosu();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(arr));
    }
}
