package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SkillTree {
    public int solution(String skill, String[] skill_tree){
        int answer = 0;

        char[] skillChar = skill.toCharArray();


        for(String x : skill_tree){
            char[] tmp = x.toCharArray();
            String comparsion = "";
            int cnt = 0;

            for(int i = 0; i < x.length(); i++){
                for(int j = 0; j < skill.length(); j++){
                    if(tmp[i] == skillChar[j]){
                        comparsion += tmp[i];
                    }
                }
            }

            char[] comparsionChar = comparsion.toCharArray();

            for(int i = 0; i < comparsion.length(); i++){
                if(comparsionChar[i] != skillChar[i]) break;
                else cnt++;
            }

            if(cnt == comparsion.length()) answer++;
        }


        return answer;
    }
    public static void main(String[] args) {
        SkillTree T = new SkillTree();
        Scanner in = new Scanner(System.in);

        String skill = in.next();

        int n = in.nextInt();

        String[] skill_tree = new String[n];

        for(int i = 0; i < n; i++){
            skill_tree[i] = in.next();
        }

        System.out.println(T.solution(skill, skill_tree));
    }
}
