package infrenalgorithm.section01.five;

import java.util.Scanner;

public class Main {

    public String solution(String str){

        String answer = "";

        char[] x = str.toCharArray();


            int lt = 0;
            int rt = str.length()-1;

            while(lt < rt){
                if(!Character.isAlphabetic(x[lt])){
                    lt++;
                }else if(!Character.isAlphabetic(x[rt])){
                    rt--;
                }else{
                    char tmp = x[lt];
                    x[lt] = x[rt];
                    x[rt] = tmp;
                    lt++;
                    rt--;
                }
            }

        String tmp = String.valueOf(x);
        answer = tmp;

        return answer;

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String str = in.next();

        System.out.println(T.solution(str));
    }
}