package spartajava.calcurator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Calculator calculator = new Calculator(new AddOperation());

        System.out.println(calculator.calculate(10,20));

        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10,20));
    }
}
