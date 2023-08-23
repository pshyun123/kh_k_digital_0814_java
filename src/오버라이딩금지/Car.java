package 오버라이딩금지;

public class Car {
    //차의 기본 속성
    int speed;
    String color;
    String name;

    //메서드 만들기
    void accelerator() {
        System.out.println("차의 속도를 증가시킵니다.");
    }
    void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다.");
    }
}
//상속을 받음
class SportsCar extends Car {
    boolean isTurbo; // 터보기능 탑재한 차량기능 추가
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }
        @Override //문법적으로 상속이 되는지 체크
        final void accelerator() {
            super.accelerator();
            System.out.println("차의 속도를 200% 증가시킵니다.");
        }
        @Override
        final void breakPanel() {
            super.breakPanel();
            System.out.println("차의 속도를 200% 감소시킵니다.");
    }
    int getSpeed() { //현재 속도가 얼마인지
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    public boolean isTurbo() {
        return isTurbo;

    }
    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }
}
class ElectricCar extends Car {
    boolean isAutoDrv;
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    public boolean isAutoDrv() {
        return isAutoDrv;
    }
    public void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);

    }

}