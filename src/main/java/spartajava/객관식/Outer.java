package spartajava.객관식;

public class Outer {
    private int x = 10;

    public static void main(String[] args) {
            Outer outer = new Outer();
           Inner.printX(outer.x);
    }

    static class Inner{

        static void printX(int x){
            System.out.println(x);
        }
    }
}
