package spartajava.week4;

public class OurBadException extends Exception{

    // throws 해줄 OurBadException() 메서드 생성
    public OurBadException(){
        super("위험한 행동을 하면 예외처리를 꼭 해야함!!");
    }
}
