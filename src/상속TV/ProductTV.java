package 상속TV;
//PrototypeTV로 부터 상속을 받아 만든 클래스
public class ProductTV extends PrototypeTV{
    String name;
    boolean isInernet;
    void PrototypeTV() {
        name = "Smart TV";
    }
    ProductTV(String name){
        isPower = false;
        channel = 10;
        volume = 10;
        isInernet = false;
        this.name = name;
    }
    void setPower(boolean isPower) {
        this.isPower = isPower; //전원 키고 끄고
    }
    void  setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            this.volume = vol;
        } else System.out.println(("볼륨 설정 범위를 벗어났습니다."));
    }
    //오버라이딩 : 부모에게서 물려받은 기능을 재정의해서 사용하는 것.
    //상속은 메소드를 부모가 가지고 있음 해당하는 기능에 대해서 명확하게 구현.
    //내가 재정의를 안하면 부모의 값이 실행
    //내가 재정의 하면 오버라이딩 됨(동적바인딩)
    //프로그래밍 - 컴파일 파일(정적), 런타임파일 (동적)

    @Override //@: 어노테이션, 컴파일러에게 어떤 작업을 할지 알려주는 것
    // 빼도 상관없는데 문법적으로 맞는지//super은 부모 것 하고 내걸 실행하겠다는 의미
    public void setChannel(int ch) {
        if(ch > 1 && ch < 2000 ) {
            channel = ch; //채널개수 늘리기
            System.out.println("채널을 " + channel + "변경했습니다.");//인터넷 기능없는 애를 위한 채널
        } else System.out.println("채널 설정범위를 벗어났습니다.");

    }
    // 메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분하는 것.
    public void setChannel(int ch, boolean isInernet) {
        if(isInernet) {
            System.out.println("인터넷 모드입니다.");
            this.isInernet = true;
        } else { //인터넷 모드가 아니면
            this.isInernet = false;
        //인터넷 기능있는 애를 위한 채널
            if(ch > 1 && ch < 2000) {
                channel = ch; //채널개수 늘리기
                System.out.println("채널을 " + channel + "변경했습니다.");
            } else System.out.println("채널 설정범위를 벗어났습니다.");
        }
    }
    void viewTV(){
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInernet);
    }

}

//00