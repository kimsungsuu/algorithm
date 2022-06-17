package hello.algorithm.inandout;
import java.io.*;
public class InAndOutFour {

        public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());


            for(int i = 0; i < n; i++){
                for(int j = 1+i; j <= n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
