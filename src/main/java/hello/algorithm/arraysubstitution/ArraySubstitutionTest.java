package hello.algorithm.arraysubstitution;

import java.util.Arrays;

public class ArraySubstitutionTest {
    public static void main(String[] args) {
        System.out.println(permutation("ABC", "BCA"));  //true
        System.out.println(permutation("ABC","BDA"));   //false
    }

    private static String sort(String s){
        char[] content = s.toCharArray(); //받은 문자를 배열에 한 자씩 담아준다.
        Arrays.sort(content); //content를 정렬
        return new String(content); //정렬된 배열을 문자열로 담아서 반환한다.
    }

    //두개의 문자열이 서로 치환인지 알아보는 함수 선언
    private static boolean permutation(String s, String t){
        //문자열 길이가 다르면 서로 치환이 x
        if(s.length() != t.length()) return false;
        //문자열 길이가 같다면 첫번째 받은 문자열과 두번째 받은 문자열을 비교해서 결과를 반환
        return sort(s).equals(sort(t));
    }
}
