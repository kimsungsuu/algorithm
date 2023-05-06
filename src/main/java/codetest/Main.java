package codetest;

public class Main {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {1,2,3};

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                System.out.println(A[i] + ", " + B[j]);
            }
        }
    }
}
