package hello.algorithm.inandout;
import java.io.*;

public class InAndOutSix {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            //공백은 n-i만큼 출력
            for(int j = 1; j <= n-i; j++){
                System.out.println(" ");
            }
            //*의 갯수는 2*i-1개 만큼 출력
            for(int k = 1; k <= 2*i-1; k++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
