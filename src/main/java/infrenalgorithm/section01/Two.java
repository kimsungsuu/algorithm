package infrenalgorithm.section01;

import java.util.Scanner;

/**
 * 대소문자 변환
 * character.toUpperCase(x) or character.toLowerCase(x) 방식
 * 또는 ASCII CODE를 이용한 방식
 */
public class Two {
    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args){

        Two T = new Two();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
