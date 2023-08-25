package 코코아톡;

import 인터페이스기본.NetworkAdapter;

public interface NetAdapter {
    void connect();
    void send(String msg);
}
class WiFi implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("WiFi에 연결되었습니다.");
    }
    @Override
    public void send(String msg){
        System.out.println("WiFi >> " + msg);
    }
}
class FiveG implements NetworkAdapter{
    @Override
    public void connect() {
        System.out.println("5G에 연결되었습니다.");
    }
    @Override
    public void send(String msg){
        System.out.println("5G >> " + msg);
    }
}
