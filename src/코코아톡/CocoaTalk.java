package 코코아톡;

import 인터페이스기본.NetworkAdapter;

public class CocoaTalk {
    private String to; // 상대방 이름
    public String msg; // 전달할 메시지
    public CocoaTalk(String name) {
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to + " : " + msg;
    }
    public void send(NetworkAdapter na){
        na.send(msg);
    }

}

