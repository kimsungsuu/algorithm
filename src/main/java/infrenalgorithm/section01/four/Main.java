package infrenalgorithm.section01.four;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //ArrayList<>로 반환
    public ArrayList<String> solution(String[] word){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : word){
            char[] s = x.toCharArray();

             int lt = 0;
             int rt = x.length()-1;

            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        //n을 입력( 3 <= n <= 20)
        int n = sc.nextInt();

        String[] word = new String[n];

        //n개의 단어를 입력
        for(int i = 0; i < n; i++){
            word[i] = sc.next();
        }

        //n개의 단어를 뒤집은 결과를 출력
        for(String x : T.solution(word)){
            System.out.println(x);

        }
    }
}
