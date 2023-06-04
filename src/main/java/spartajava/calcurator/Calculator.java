package spartajava.calcurator;

public class Calculator {

   private int firstNumber;
   private int secondNumber;

   private AbstractCalculator operation;

   public Calculator(AbstractCalculator operation){
       this.operation = operation;
   }

   public void setOperation(AbstractCalculator operation){
       this.operation = operation;
   }

   public void setFirstNumber(int firstNumber){
       this.firstNumber = firstNumber;
   }

    public void setSecondNumber(int secondNumber){
        this.secondNumber = secondNumber;
    }



    public int calculate(){
        int answer = 0;

        answer = operation.operate(this.firstNumber, this.secondNumber);

        return answer;
    }
}
