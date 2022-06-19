package hello.algorithm.inandout;
import java.io.*;

public class InAndOutFive {


        public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());

            for(int i = 0; i < n; i++){
                for(int j = 1; j<=n; j++){
                    System.out.print("*");
                    for(int k = 0; k <= i; k++){
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }


        }
    }
