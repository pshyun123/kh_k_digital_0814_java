package 추상클래스2;

public class SmartPhone extends Phone {
    public SmartPhone(String name) {
        super(name); //부모의 생성자 호출
    }

    @Override
    void call() { //추상메소드를 오버라이드 함
        System.out.println("부모 클래스의 call() 메소드를 구체화 함, 통화기능 완성");
    }
    public void internet(){
        System.out.println("인터넷을 검색합니다.");//없는 기능 추가
    }
}
