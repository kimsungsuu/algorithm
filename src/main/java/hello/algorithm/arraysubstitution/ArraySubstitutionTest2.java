package hello.algorithm.arraysubstitution;

import java.util.Arrays;

public class ArraySubstitutionTest2 {
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
        //문자열 길이가 같다면 128배의 배열방을 만든다.
        int[] letters = new int[128];
        //배열방을 돌면서 아스키코드 값으로 순차적으로 배열방을 증가(삽입)시켜준다.
        //결과적으로 각 문자열의 개수가 배열방에 저장된다.
        for(int i =0; i<s.length(); i++){
            letters[s.charAt(i)]++; //charAt은 문자열을 char형으로 변환시켜준다
        }
        for(int i=0; i<t.length(); i++){
            letters[t.charAt(i)]--; //s문자열이 들어간 배열방에서 t문자열만큼 빼준다.
            if (letters[t.charAt(i)] < 0) return false; // 두번째 문자열 갯수가 다르다면 false 반환
        }
        return true;
    }
}
