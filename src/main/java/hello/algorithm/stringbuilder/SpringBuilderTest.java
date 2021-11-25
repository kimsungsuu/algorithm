package hello.algorithm.stringbuilder;

class StringBuilder{
    private char[] value; //저장할 문자열
    private int size; //배열 사이즈
    private int index; //새로 추가될 char의 방 번호를 기억하기 위한 index

    StringBuilder(){
        size = 1;   //배열방 크기 1로 초기화
        value = new char[size]; //크기만큼 배열방을 생성
        index = 0;  // 새로 추가될 배열 번호는 0번부터
    }

    //문자열을 추가하는 함수
    public void append(String str){
        if (str == null) str = "null";
        int len = str.length();
        ensureCapacity(len);    //배열방이 문자열을 담을 수 있는지 체크, 부족하면 늘려줌.

        //문자열을 돌면서 한자씩 배열방에 담아줌, index를 증가시켜서 다음 배열방을 가리킴
        for(int i = 0; i < str.length(); i++){
            value[index] = str.charAt(i);
            index++;
        }
        System.out.println("*** " + size + ", " + index);
    }

    //배열방이 넉넉하지 않으면 배열방 크기를 늘려주는 함수 선언
    //ensure = 보장, 보증하다 , capacity = 용량
    private void ensureCapacity(int len){
        if(index + len > size) { //현재 index + 문자열 길이가 size 즉, 배열방 크기를 초과하면
            size = (size + len) * 2; //넉넉하게 방 사이즈를 키워줌
            char[] newValue = new char[size];   //새로 만든 방 사이즈 만큼 새로운 배열방을 만들어줌

            //기존 배열방 값들을 새로운 배열방을 돌면서 추가해준다.
            //문자열이기 때문에 포인터로 복사해준다.
            for(int i =0; i<value.length; i++){
                newValue[i] = value[i];
            }
            value = newValue;
        }
    }

    //저장된 문자열을 반환하는 함수 선언
    public String toString(){
        return new String(value, 0, index);
    }
}

public class SpringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("sungsu");
        sb.append(" is");
        sb.append(" handsome");
        System.out.println(sb.toString());
    }
}
