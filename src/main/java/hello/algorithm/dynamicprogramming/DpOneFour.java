package hello.algorithm.dynamicprogramming;

import java.util.*;

public class DpOneFour {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            int[] array = new int[11];

            array[0] = 0;
            array[1] = 1;
            array[2] = 2;
            array[3] = 4;


            int a = 0;
            for(int i = 0; i < num; i++) {
                a = sc.nextInt();
                for(int j = 4; j <= a; j++) {
                    array[j] = array[j - 1] + array[j - 2] + array[j - 3];
                }
                System.out.println(array[a]);
            }
        }

    }



