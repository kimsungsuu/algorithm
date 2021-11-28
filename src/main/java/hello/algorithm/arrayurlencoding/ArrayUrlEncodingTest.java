package hello.algorithm.arrayurlencoding;

public class ArrayUrlEncodingTest {
    public static void main(String[] args) {
        System.out.println(URLify("Mr John Smith      ", 13));
    }

    //string을 받아서 char 변수로 변환해주는 함수
    private static String URLify(String str, int len){
        return URLify(str.toCharArray(), len);
    }

    //본격적인 처리를 하는 함수
    private static String URLify(char[] str, int len){
        int spaces = 0; //공백의 갯수를 세기 위해 공백의 수를 저장할 변수 선언
        //문자열을 돌면서 공백을 발견하면 spaces++
        for(int i =0; i<len; i++){
            if(str[i] == ' ') spaces++;
        }
        //새로 만들어진 문자열의 인덱스를 계산
        //기존 문자열 + 공백 x 2 - 1(0부터 시작이기 때문에 -1)
        int index = len + spaces * 2 - 1;

        //뒤에서부터 돌리는 for문
        // p= pointer, 문자열의 맨 마지막에 배치 시킨다.
        for(int p = len - 1; p >= 0; p--){

            //포인터가 가르키는 곳이 공백이면 index를 하나씩 감소시키면서 %20을 채워나간다.
            if(str[p] == ' '){
                str[index--] = '0';
                str[index--] = '2';
                str[index--] = '%';
            }else{
                str[index--] = str[p]; //공백이 아닌 경우, 포인터 위치에 있는 값을 인덱스가 위치한 인덱스에 저장한다.
            }
        }
        return new String(str); //loop가 끝나면 해당 배열을 문자열로 반환
    }
}
