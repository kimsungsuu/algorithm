package spartajava.객관식;

public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("시동을 켭니다.");
    }

    @Override
    public void stop(){
        System.out.println("시동을 끕니다.");
    }
}
