package hello.algorithm.inandout;
import java.io.*;

public class InAndOutSeven {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //줄바꿈은 5개, *은 i개만큼, 공백은 (2*n)-(2*i)만큼, 공백 후에 다시 * i개 만큼
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <=(2*n)-(2*i); k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        //줄바꿈은 4개, *은 n-i만큼, 공백은 2*i만큼, 공백후에 다시 *은 n-i만큼
        for(int i =1; i <= n-1; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2*i; k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= n-i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
