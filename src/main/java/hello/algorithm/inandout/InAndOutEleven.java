package hello.algorithm.inandout;
import java.io.*;

public class InAndOutEleven {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n-1; i++){
            //앞부분 공백
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 1; k++ ){
                System.out.print("*");
            }
            //i가 2이상 일때부터 공백과 뒷부분 *적용
            if(i>=2) {
                for (int l = 1; l <= 2*(i-1)-1; l++) {
                    System.out.print(" ");
                }
                for(int m = 1; m <=1; m++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        //마지막 줄은 별개로 2*n-1 출력
        for(int m = 1; m <= 2*n-1; m++){
            System.out.print("*");
        }
    }
}
