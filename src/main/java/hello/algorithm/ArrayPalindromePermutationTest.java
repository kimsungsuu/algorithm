package hello.algorithm;

public class ArrayPalindromePermutationTest {
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("aa bb cc dd"));
        System.out.println(isPermutationOfPalindrome("aa bb cc dd e"));
        System.out.println(isPermutationOfPalindrome("aa bb cc dd e fff"));

    }

    private static boolean isPermutationOfPalindrome(String s){
        int[] table = buildCharFrequencyTable(s);   //생성된 문자열 담는다.
        return checkMaxOneOdd(table);   // 해당 배열의 홀수개의 문자가 한개 이상이면 false를 반환하는 함수
    }

    private static int[] buildCharFrequencyTable(String s){
        //z에서 a의 아스키값을 빼면 25가 나오는데 + 1을 해서 26개의 방을 만들어준다.
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a') + 1];

        //문자열을 char로 변환해서 한자씩 돌려준다.
        for (char c : s.toCharArray()) {
            //배열방 크기가 26인데 소문자 아스키값이 96부터 시작하므로 getCharNumber로 변환해서 index에 저장하는 함수
            int x = getCharNumber(c);
            //문자가 아닌 값은 제외할 때만 table++
            if(x != -1){
               table[x]++;
            }
        }
        return table;
    }
    private static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c); //문자로 받은 배열의 아스키 값을 가져옴
        //인자로 받은 배열이 a~z 사이 값이라면
        if( a<=val && val <= z){
            return val - a; //a는 0번방, b는 1번방 ...
        }
        return -1;  // 위에서 반환 못한 값은 알파벳 문자가 아니라는 의미이므로 -1 반환
    }

    //추가 저장된 배열방을 돌면서 홀수가 두개 이상인지 확인하는 함수
    private static boolean checkMaxOneOdd(int[] table){
        boolean foundOdd = false;
        for (int count : table) {
            if(count % 2 == 1){
                if(!foundOdd){
                    foundOdd = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
