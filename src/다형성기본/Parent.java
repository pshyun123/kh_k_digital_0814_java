package 다형성기본;
//얘도 상속받고 있음-> extends Object
public class Parent {
    protected int num = 1000000; //protected : 상속관계 혹은 같은 패키지 내에서 접근 가능
    protected int money = 10000;
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
//00