package hello.algorithm.arraryverifyduplicate;

public class ArrayBitTest {
    public static void main(String[] args) {
        System.out.println(isUnique("abcdefgghijk"));   //중복된 값이 있으므로 false 반환
        System.out.println(isUnique("abcdefghijk"));
    }
    private static boolean isUnique(String str){
        int checker = 0;    //각 문자의 정수 여부를 마킹

        //문자열을 돌면서 문자를 한자씩 가져오면서 가져온 아스키 값에서 a만큼 빼준다.
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            //1을 해당 문자만큼 시프트한 값이 checker 안에 들어있는지 비트 연산자 and로 확인
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |=(1 << val); //or 연산자를 이용해 true 삽입
        }
        return true;
    }
}
