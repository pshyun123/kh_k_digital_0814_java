package 객체타입확인;
//상속관계가 성립하는지 확인하는 용도.
//왼쪽 피연산자가 오른쪽 피연산자의 인스턴스인지를 검사하며, 결과는 불리언 값(true 또는 false)으로 반환됩니다.
//상속관계 성립 true, 아니면 false

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent); //true
        System.out.println(child instanceof Parent);     //true
        System.out.println(parent instanceof Child); //falseㄷ

    }
}
class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {
    Child(String name) {
        super("부모");//부모, 생성자 만드는데 부모가 디폴트 생성자가 아님
        this.name = name; //자식클래스 만들때 초기화하자
    }
}