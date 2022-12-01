package codetest;

public class ChangeTest {
    public static void main(String[] args) {
        int x = 88;
        String a2 = Integer.toBinaryString(88);
        System.out.println("a2 = " + a2);

        int a2_2 = Integer.parseInt(a2,2);
        System.out.println("a2_2 = " + a2_2);
    }
}
