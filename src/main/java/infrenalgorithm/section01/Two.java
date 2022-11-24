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
            if(x >= 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x+32);
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
