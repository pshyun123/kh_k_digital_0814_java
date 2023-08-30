package 아이패드만들기;

import java.util.List;
import java.util.Vector;

// ArrayList와 동일한 내부 구조, 동기화가 지원되어서 멀티 쓰레드 환경에서 안전함.
// 하지만 ArrayList 대비 성능 떨어짐
public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우", "yyy@gmail.com", "010-0000-0000", "변호사"));
        // 생성자 이용해서 객체 바로 집어 넣을 수 있음, DB에서 넘어오는 데이터임.

    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}