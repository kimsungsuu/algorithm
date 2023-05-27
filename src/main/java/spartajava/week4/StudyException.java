package spartajava.week4;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        // ourClass.thisMethodIsDangerous(); 메서드는 throws로 선언되어 있기 때문에 아래와 같이 사용할 수 없다,
//        ourClass.thisMethodIsDangerous();

        try {
            //일단 실행
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("우리는 방금 예외를 핸들링 했습니다. 항상 이곳을 거쳐요");
        }
    }
}
