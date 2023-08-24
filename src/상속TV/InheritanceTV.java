package 상속TV;
// 이전에 만들었던 TV에서 상속관계를 적용하고, 오버라이딩 이점을 확인.
public class InheritanceTV {
    public static void main(String[] args) {
        PrototypeTV prototypeTV = new PrototypeTV();
        //상속을 주는 클래스가 객체화(인스턴스화)된다는 의미는 추상화가 아니라는 의미
        ProductTV productTV = new ProductTV("우리집 TV");
        productTV.setPower(true);
        productTV.setVolume(120);
        productTV.setChannel(1500,true);//false 인터넷이 꺼져있는 상태
        productTV.viewTV();

    }
}
//00