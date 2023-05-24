package spartajava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SecondMission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 내가 좋아하는 요리 제목을 먼저 입력합니다.
        String cookTitle = in.nextLine();

        // 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)

        float rateNum = in.nextFloat();
        in.nextLine();
        // 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.

        Queue<String> Q = new LinkedList<>();
        for(int i = 1; i <= 10; i++){
            String tmp = in.nextLine();
            Q.offer(tmp);
        }

        // 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
        System.out.println("[ " + cookTitle + " ]");

        // 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
        //바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)

        float ratePer = 20 * (int)rateNum;

        System.out.println("별점 : " + (int)rateNum + " (" + ratePer + "%)");

        // 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.
        for(int i = 1; i <= 10; i++){
            System.out.println(i + ". " + Q.poll());
        }
    }
}
