package infrenalgorithm.다이나믹프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

class CuboidTwo implements Comparable<CuboidTwo>{
    public int area; // 밑면 넓이
    public int height;
    public int weight;

    public CuboidTwo(int area, int height, int weight){
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(CuboidTwo o){
        return o.area - this.area;
    }
}

public class 가장높은탑쌓기 {

    static int[] dy;

    public int solution(CuboidTwo[] arr){
        int answer = 0;
        dy = new int[arr.length];

        dy[0] = arr[0].height;

        // 반드시 하나의 탑이 쌓일 수 있으므로
        answer = dy[0];

        for(int i = 1; i < arr.length; i++){
            int tmp = arr[i].height;
            dy[i] = arr[i].height;
            for(int j = i - 1; j >= 0; j--){
                // 무게가 더 적으면서, 쌓인 탑이 가장 높은 경우
                if(arr[j].weight > arr[i].weight && dy[j] + dy[i] > tmp) {
                    tmp = dy[i] + dy[j];
                }
            }
            dy[i] = tmp;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        가장높은탑쌓기 T = new 가장높은탑쌓기();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        CuboidTwo[] arr = new CuboidTwo[n];

        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            arr[i] = new CuboidTwo(a, b, c);
        }

        Arrays.sort(arr);

        System.out.println(T.solution(arr));

    }
}
