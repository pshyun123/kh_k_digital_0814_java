package TV기본예제;

public class TV {
    private boolean isON; //TV 전원
    private int channel;  //채널
    private int volume;   //볼륨
    //인스턴스 필드에
    //순차적인 반응이 아님. 동작에 대한 것.
    TV() {
        isON = false;
        channel = 11; //11번
        volume = 10; //공장초기화 값//매개변수 받지 않는 것 하나
        System.out.println("전원 : " +isON+", 채널 : " + channel + ", 볼륨" + volume);
    }
    TV(boolean isON, int ch, int vol){
        this.isON = isON;
        channel = ch;
        volume = vol;
        System.out.println("전원 : " +isON+", 채널 : " + channel + ", 볼륨" + volume);
    }
//위에까지는 공장초기화 값
    public void setON(boolean isON) { //꺼라 켜라
        this.isON = isON;
        String onoffStr = (isON) ? "ON" : "OFF"; //boolean을 참거짓에서 on off로 바꿔줌
        System.out.println("TV 전원이 " + onoffStr + "되었습니다.");
    }
    public void setChannel(int ch){ //채널을 넣고
        if (ch >= 1 && ch <= 990) { //1~990까지만 허용범위, private해둔 값에 얘만 영향가능. 접근통로를 막음
            channel = ch;
            System.out.println("채널을 " + channel + "로 변경하였습니다.");

        } else {
            System.out.println("채널 설정값이 허용 범위를 벗어났습니다.");
        }

    }
    public void setVolume(int vol) {
        if(vol >= 0 && vol <= 100){
            volume = vol;
            System.out.println("볼륨을 " + volume + "변경하였습니다.");
        }
    }
    public void getInfoTV(){
        String onoffStr = (isON) ? "ON" : "OFF";
        System.out.println("=".repeat(5) + "TV 정보" + "=".repeat(5));
        System.out.println("전원 : " + onoffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);

    }
}
//cf. 이벤트 드리블? 방식 : 이벤트가 일어났을때만 수행. 코드 만들어두고 버튼이 눌릴때 어떤 메소드를 불러올지



