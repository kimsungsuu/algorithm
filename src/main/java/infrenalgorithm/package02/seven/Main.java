package infrenalgorithm.package02.seven;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr){
        int answer = 0;

        int[] ch = new int[n];
        ch[0] = arr[0];
        answer = ch[0];
        int cnt = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] == 0) ch[i]=0;
            else {
                if(arr[i] != arr[i-1]){
                    ch[i]=arr[i];
                    cnt = 1;
                }else{
                    cnt++;
                    ch[i] = cnt;
                }
            }
            answer += ch[i];
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

        System.out.println(T.solution(n, arr));
    }
}
