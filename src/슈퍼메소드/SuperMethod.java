package 슈퍼메소드;
//super : 부모의 필드나 메소드를 접근할 때 사용
//super() : 부모의 생성자를 호춫ㄹ
public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
class Parent{
   int x = 10;
   int a;
   Parent() { a = 10;}
    Parent(int n) {a = n;}
}
//
class Child extends Parent {
 int b;
 Child() {
     super(100);
     b = 20;}

 void display(){
     System.out.println(a);
     System.out.println(b);
 }

}