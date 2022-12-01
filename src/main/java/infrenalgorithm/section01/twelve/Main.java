package infrenalgorithm.section01.twelve;


import java.util.Scanner;

/**
 * 12. 암호
 */
public class Main {
    public String solution(String str, int n){
        String answer = "";

        int p = 0;
        int tmp2 = 0;
        String tmp = "";

        for(int i = 0; i < n; i++){
            p += 7;
            for(int j = p-7; j < p; j++){
                if(str.charAt(j) == '#') tmp += "1";
                else tmp += "0";
            }
            tmp2 = Integer.parseInt(tmp,2); //문자열 tmp를 10진수로 변환

            answer += (char)(tmp2); // 변환된 십진수를 문자로 변환
            tmp = ""; //tmp를 비워줘서 tmp2에 새로운 10진수로 담기고 그 값이 answer 문자열에 추가되도록함.
        }

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str  = sc.next();

        System.out.println(T.solution(str, n));

    }
}

// #를 만났을 때는 1로, *을 만났을 때는 0으로 변경
// 문자열 str을 받을 때 입력한 n의 7배만큼 입력 가능(문자열을 나누지 않고 한번에 다 입력하기 때무에 7자씩 끊어서 해석해야함)
// 변경된 이진수 7자리를 십진수로 변경
// 변경된 십진수의 알파벳 값을 answer 문자열에 추가

