package 디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 대문자일경우 final Static 추가됨;
    // 상속이 안됨. 여기에서만 살아있음. 이점? 아예 인터페이스 설계도면에다가 고정값을 정함
    int MIN_VOLUME = 0;
    void turnON(); // 자동으로 public abstract 추가됨
    void turnOFF();
    void setVolume(int vol);

    //디폴트 메소드는 JDK 8 이후에 추가 됨
    default void setMute(boolean mute){
      if(mute) System.out.println("무음 처리합니다.");
      else System.out.println("무음 해제합니다.");
    }

    static void chaneBattery(){
        System.out.println("건전지 교환합니다.");
    }
}
