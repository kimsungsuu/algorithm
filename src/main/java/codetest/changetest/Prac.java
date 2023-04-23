package codetest.changetest;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int[] num = {0, 1, 2};
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));
        System.out.println("Arrays.deepToString(score) = " + Arrays.deepToString(score));
        System.out.println();

        String[][] strArr1 = {
                {"AAA","BBB","CCC"},
                {"aaa","bbb","ccc"},
        };
        String[][] strArr2 = {
                {"AAA","BBB","CCC"},
                {"aaa","bbb","ccc"},
        };

        // 1 차원 비교에는 equals
        System.out.println("Arrays.equals(strArr1[0], strArr2[0]) = " + Arrays.equals(strArr1[0], strArr2[0])); // true
        System.out.println("Arrays.equals(strArr1[1], strArr2[0]) = " + Arrays.equals(strArr1[1], strArr2[0])); // false

        System.out.println("Arrays.equals(strArr1, strArr2) = " + Arrays.equals(strArr1, strArr2)); // false

        System.out.println();
        // 다차원 비교에는 deepEquals
        System.out.println("Arrays.deepEquals(strArr1, strArr2) = " + Arrays.deepEquals(strArr1, strArr2)); // true
    }
}
