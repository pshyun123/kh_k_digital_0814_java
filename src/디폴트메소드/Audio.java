package 디폴트메소드;

public class Audio implements RemoteControl{
    private int volume;//오디오의 볼륨
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");

    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(vol < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else{
            this.volume = vol;
        }

        System.out.println("현재 오디오 볼륨 : " + this.volume);

        }
    void getInfo() {
        System.out.println("오디오입니다.");
        System.out.println("현재 오디오 볼륨은+ " +volume+"입니다.");

    }
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음 처리합니다.");
        else System.out.println("무음처리를 해제합니다.");
    }
}
