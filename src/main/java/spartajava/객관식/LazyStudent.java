package spartajava.객관식;

public class LazyStudent extends Student{

    @Override
    void makeSound(){
        System.out.println("공부는 지겨워ㅠ");
    }

    void makeFood(){
        System.out.println("저는 요리중입니다.");
    }
}
