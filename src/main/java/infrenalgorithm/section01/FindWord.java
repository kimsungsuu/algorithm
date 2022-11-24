package infrenalgorithm.section01;
import java.util.Scanner;

public class FindWord {

    public int solution(String str, char t){
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        FindWord findWord = new FindWord();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        System.out.print(findWord.solution(str, t));
    }
}
