package 인터페이스기본;
//추상화가 걸려있는걸로 만들기
public interface NetworkAdapter { //실제 네트워킹 기능과 연결됨
    void connect(); // 자동으로 public abstract 포함됨.

    void send(String msg);
}
//=====실체화 하는 단계=====
class LAN implements NetworkAdapter { //유선인터넷 LAN
    String company;
    LAN(String company) {
        this.company = company;
    }
    @Override
    public void connect(){
        System.out.println(company + " LAN에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {

    }
}
class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect(){
        System.out.println(company + "WiFi에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {

    }
}
class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect(){
        System.out.println(company + "5G에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {

    }
}