package 상속TV;
//시제품
public class PrototypeTV {
    boolean isPower;  // 전원 값 저장
    int channel;      // 채널 정보 저장
    int volume;       // 볼륨 값 저장
    public PrototypeTV() {
        this.isPower = false; // 초기화
        this.channel = 10;
        this.volume =10;
    }

    //아래는 생성자 오버로딩
    public PrototypeTV(boolean isPower, int channel, int volume) { //반환값을 보지 않음 메소드 오버로딩, 생성자오버로딩이 동일, 반환타입이 없기때문에
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;

    }
    public void setChannel(int ch){
        if(ch > 0 && ch < 1000) {
            channel = ch; //이렇게 해야 인스턴스 값
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
//00