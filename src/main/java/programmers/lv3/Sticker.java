package programmers.lv3;


public class Sticker {


    public static int solution(int sticker[]) {
        int answer = 0;

        int len = sticker.length;

        if (len == 1) return sticker[0];

        int[] dp1 = new int[len];
        int[] dp2 = new int[len];

        //첫번째 스티커를 떼는 방법
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for (int i = 2; i < len-1;i++) {
            dp1[i] = Math.max(dp1[i-1],dp1[i-2] + sticker[i]);
        }

        System.out.println();

        //첫번째 스티커를 뗴지 않는 방법
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i = 2; i < len; i++) {
            dp2[i] = Math.max(dp2[i-1],dp2[i-2] + sticker[i]);
        }

        answer = Math.max(dp1[len-2],dp2[len-1]);

        return answer;
    }

    public static void main(String[] args) {
        Sticker T = new Sticker();

        int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};

        System.out.println(T.solution(sticker));
    }
}
