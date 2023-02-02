package programmers.lv2;

import com.fasterxml.jackson.core.JsonToken;

import java.util.HashMap;
import java.util.Scanner;

public class EnglishFollowUp {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;

        HashMap<String, Integer> map = new HashMap<>();

        int lt = 0, rt = 1;
        int cnt = 0;
        //words 내에 같은 문자열이 나올 때
        for(String x : words){
            map.put(x, map.getOrDefault(x, 0)+1);
            lt++;
            if(map.get(x) == 2){
                answer[0] = lt;
                answer[1] = rt;
                System.out.println(answer[0] + "" + answer[1]);
                return answer;
            }

            if(lt == n) {
                lt = 0;
                rt++;
            }
        }

        lt = 1;
        rt = 1;

        // 앞 문자열의 끝 글자와 현재 글자의 첫 글자가 같지 않을 때
        for(int i = 1; i < words.length; i++){
            char t = words[i-1].charAt(words[i-1].length()-1);
            char t2 = words[i].charAt(0);
            if(lt == n){
                lt = 0;
                rt++;
            }
            lt++;
            if(t != t2){
                answer[0] = lt;
                answer[1] = rt;
                System.out.println(answer[0] + "" + answer[1]);
                return answer;
            }
        }

        System.out.println(answer[0] + "" + answer[1]);
        return answer;
    }

    public static void main(String[] args) {
        EnglishFollowUp T = new EnglishFollowUp();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[] words = {"hello", "observe", "effect", "take", "either", "kecognize", "kncourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "kxecutive"};

        System.out.println(T.solution(n, words));


    }
}
