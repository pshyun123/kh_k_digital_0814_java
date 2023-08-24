package 다형성기본;

public class Child extends Parent {
    private int x = 100;
    public Child () {} //접근제한자를 아무것도 안 붙이거나 private 을 붙이면 호출이 안됨. private 사용하는 경우는 싱글톤
        //원래는 default 접근제한자가 붙어있음. 지금까지 괜찮은 이유는 같은 클래스 안에서 작업 많이 했어서
    public void out() {
        System.out.println("부모의 protected num 필드 : " + money);
        System.out.println("자식 클래스 메소드");

    }

    @Override
    public void display() {
        System.out.println("상속받아 재정의한 메소드");
    }
}
//00