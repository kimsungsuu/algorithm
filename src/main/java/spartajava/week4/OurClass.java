package spartajava.week4;

public class OurClass {
    private final boolean flag = true;

    // 이 메서드는 위험할 수 있으니 throws를 선언해놓고
    public void thisMethodIsDangerous() throws OurBadException{
        // 위험한 상황이 발생했을 때 throw 해준다.
        if(flag){
            throw new OurBadException();
        }
    }
}
