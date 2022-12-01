package codetest;

import java.util.Scanner;

public class SubStringTest {

        public String solution(String str){
            String answer = "YES";

            str = str.toUpperCase();

            int len = str.length();


            for(int i = 0; i < len/2; i++){
                if(str.charAt(i) != str.charAt(len-1-i)){
                    answer = "NO";
                    break;
                }
                System.out.println("answer = " + answer);
            }

            System.out.println("result = " + answer);
            return answer;
        }

        public static void main(String[] args){
            SubStringTest T = new SubStringTest();
            Scanner in=new Scanner(System.in);

            String str = in.next();

            System.out.println(T.solution(str));
        }
    }
