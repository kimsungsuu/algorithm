package ch02;
import java.util.Random;
import java.util.Arrays;

public class personalAlgorithm {

    public static void main(String[] args) {
        Random random = new Random();
        int[] lotto = new int[6];

        for(int i = 0; i < lotto.length; i++){
            lotto[i] = random.nextInt(44) + 1;
            for(int j = 0; j < i; j++){
                i--;
                break;
            }
        }

        System.out.println("로또 번호 : " + Arrays.toString(lotto));
    }
}
