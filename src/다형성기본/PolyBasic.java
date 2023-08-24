package 다형성기본;

public class PolyBasic {//클래스이름과 파일이름이 같아야,자바에서만 있음
    public static void main(String[] args) {

        Parent parent = new Parent();// 부모참조객체
        Child child = new Child();   // 자식참조객체
        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); // 부모 클래스의 참조변수로 자식 객체를 접근함.
        //왜 가능? 부모에게서 상속받아서.
        p.display(); //오버라이딩이 일어나 child 메서드가 우선적으로 불려짐.

    }
}

//00