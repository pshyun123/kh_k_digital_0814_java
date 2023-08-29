package 추상클래스2;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        //부모것 가지고 폰을 만듦
        Phone phone = new Phone("목업") {

            @Override
            void call() {
                System.out.println("목업폰은 사용불가");

            }
        }; //익명의 개체, 클래스를 만들지 않음, 구현부에 대한 개체 생성
        phone.call();
    }
}
