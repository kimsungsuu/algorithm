package hello.algorithm.arraryverifyduplicate;

import java.util.HashMap;

public class ArrayUnicodeTest {
    public static void main(String[] args) {
        System.out.println(isUnique("abcdefgghijk"));   //중복된 값이 있으므로 false 반환
        System.out.println(isUnique("abcdefghijk"));
    }
    private static boolean isUnique(String str){
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();

        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i);
            //배열을 돌아서 중복 값이 있으면 false 반환
            if(hashMap.containsKey(c)){
                return false;
            }
            hashMap.put(c, true);
        }
        return true;
    }
}
