package codetest;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Random random = new Random(System.currentTimeMillis());
    Scanner scanner = new Scanner(System.in);

    public void findAnswer() {

        int answer = random.nextInt(101);
        int input = 0;

        int cnt = 0;

        while(true){

            System.out.print("숫자 입력: ");

            input = scanner.nextInt();

            if(answer < input){
                System.out.println("DOWN");
            }else if(answer > input){
                System.out.println("UP");
            }else{
                System.out.println("CORRECT");
                break;
            }

            cnt++;
        }

        System.out.printf("숫자 입력한 횟수 : %d번\n", cnt);

        scanner.close();
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.findAnswer();
    }
}



