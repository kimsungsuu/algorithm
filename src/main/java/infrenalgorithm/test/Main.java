package infrenalgorithm.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int a[][][] = new int [4][11][11];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 11; j++){
                for(int k = 0; k < 11; k++){
                    a[i][j][k] = i+1;
                    System.out.print(a[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
