package spartajava.calcurator;

public class Calculator {

   private AbstractCalculator operation;

   public Calculator(AbstractCalculator operation){
       this.operation = operation;
   }

   public void setOperation(AbstractCalculator operation){
       this.operation = operation;
   }

    public int calculate(int a, int b){
        int answer = 0;

        answer = operation.operate(a, b);

        return answer;
    }
}
