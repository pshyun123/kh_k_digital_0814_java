package 추상클래스;
// 추상클래스는 클래스 앞에 abstract 키워드를 붙여서 만듦
// 추상클래스는 객체화 안됨
// 내부에 0개 이상의 추상 메소드가 포함되어 있음
// 추상메소드는 상속받는 클래스에서 오버라이딩 해줘야 함(해당 메소드의 기능 구체화 시킴)
// 느슨한 결합관계 부모가

public abstract class AnimalClass {
    abstract void cry();  //추상메소드 : 상속받은 클래스에서 구체화를 해줘야 함(오버라이딩)
    // 실체 구분 방법 // (); 이름만 있음 {}까지 있으면 안됨.
    void sleep() {// 일반 메소드, 상속여부 관계없음
        System.out.println("zzzzzzzz"); //
    }
}
class Cat extends AnimalClass{
    @Override
    void cry(){
        System.out.println("냐아아옹");

    }
    @Override
    void sleep() {
        System.out.println("ZZZZZZZZZZZZZZZZZ");
    }
}
class Dog extends AnimalClass{
    @Override
    void cry() {
        System.out.println("wolf!");

    }

}
