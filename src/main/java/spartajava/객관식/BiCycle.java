package spartajava.객관식;

public class BiCycle implements Vehicle{
    @Override
    public void start(){
        System.out.println("페달을 밞습니다.");
    }

    @Override
    public void stop(){
        System.out.println("페달을 놓습니다.");
    }
}
