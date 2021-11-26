package hello.algorithm.arraryverifyduplicate;

public class ArrayAsciiTest {
    public static void main(String[] args) {
        System.out.println(isUnique("abcdefgghijk"));   //중복된 값이 있으므로 false 반환
        System.out.println(isUnique("abcdefghijk"));
    }
    private static boolean isUnique(String str){
        if(str.length() > 128) return false;    //128이 넘는 값이 들어왔다는건 중복됐다는 의미이므로 false 반환
        boolean[] char_set = new boolean[128]; //각 문자 존재 여부를 판단할 128배의 배열방을 생성

        //배열방을 돌면서 문자가 없다면 true 생성, 있다면 false 반환
        for(int i =0; i<str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val]= true;
        }
        return true;    // 배열을 다 돌았는데 false가 없다는건 중복이 없다는 이유이므로 true 반환
    }
}
