package hello.algorithm;
import java.io.*;

public class inandouttwo {

        public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int month = Integer.parseInt(br.readLine());
            int day = Integer.parseInt(br.readLine());

            int sum = 0;

            int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for(int i = 1; i <= 12; i++){
                if(i==month){
                    break;
                }
                sum += months[i];
            }

            sum += day;

            int left = sum%7;
            switch(left){
                case 0 : System.out.println("SUN"); break;
                case 1 : System.out.println("MON"); break;
                case 2 : System.out.println("TUE"); break;
                case 3 : System.out.println("WED"); break;
                case 4 : System.out.println("THU"); break;
                case 5 : System.out.println("FRI"); break;
                case 6 : System.out.println("SAT"); break;
            }

        }
    }


