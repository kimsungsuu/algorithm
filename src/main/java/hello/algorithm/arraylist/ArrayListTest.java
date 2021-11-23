package hello.algorithm.arraylist;

class ArrayList{
    private Object[] data;  //배열에 들어갈 데이터
    private int size;   //배열의 크기
    private int index;  //다음 데이터를 추가할 위치를 기억

    public ArrayList() {
        this.data = new Object[this.size];  //size만큼 배열방 생성
        this.size = 1;
        this.index = 0; // 새로 들어온 데이터는 0번방으로 등록
    }

    public void add(Object obj){
        System.out.println("index:" + this.index + ", size: " + this.size + ", data size : " + this.data.length);

        //배열방 등록 전에 방이 다 찼는지 비교
        if(this.index == this.size -1 ){
            doubling();
        }
        data[this.index] = obj; // 배열방 맨 끝에 데이터 추가
        this.index++;
    }
    private void doubling(){
        this.size = this.size * 2;  //size를 두배로 늘림
        Object[] newData = new Object[this.size];
        for(int i =0; i<data.length; i++){
            newData[i] = data[i];   //포인터(주소)를 newData에 복사함
        }
        this.data = newData;
        System.out.println("*** index: " + this.index + ", size : " + this.size + ",data size: " + this.data.length);
    }
    public Object get(int i) throws Exception{
        if(i > this.index-1){   //갖고 있는 데이터 보다 클 경우 Exception
            throw new Exception("ArrayIndexOutOfBound");
        }else if(i < 0){
            throw new Exception("Negative Value");
        }
        return this.data[i];
    }

    public void remove(int i )throws Exception{
        if(i > this.index-1){
            throw  new Exception("ArrayIndexOutOfBound");
        }else if(i < 0){
            throw new Exception("Negative Value");
        }
        System.out.println("data removed: " + this.data[i]);
        //index삭제 시 한칸씩 앞으로 shift해서 빈자리를 매꿔줌
        for(int x = i; x < this.data.length - 1; x++){
            data[x] = data[x+1];
        }
        this.index--;
    }
}

public class ArrayListTest {
    public static void main(String[] args) throws Exception {
        ArrayList al = new ArrayList();
        al.add("0");
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add("7");
        al.add("8");
        al.add("9");
        System.out.println(al.get(5));
        al.remove(5);
        System.out.println(al.get(5));
    }
}
