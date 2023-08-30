package Vector만들기;

import java.util.List;
import java.util.Vector;
//ArrayList와 동일한 내부 구조, 동기화가 지원되어서 멀티 쓰레드 환경에서 안전함. 하지만 ArrayList 대비 성능 떨어짐
public class VectorClass {
    public static void main(String[] args) {
            List<NameCard> list = new Vector<>();//Linked 나 ArrayList로 바꿔도 다 똑같음
            list.add(new NameCard("우영우", "yyy@gmail.com", "010-1234-5678", "변호사"));
            list.add(new NameCard("동그라마", "ddd@gmail.com", "010-1234-5678", "무직"));
            list.add(new NameCard("이준호", "ljh@gmail.com", "010-1234-5678", "회사원"));

            for(NameCard e : list) {
                System.out.println("이름 : " + e.name);
                System.out.println("메일 : " + e.mail);
                System.out.println("전화 : " + e.phone);
                System.out.println("직업 : " + e.jobs);
            }
        }
    }

    class NameCard {
        String name;
        String mail;
        String phone;
        String jobs;

        public NameCard(String name, String mail, String phone, String task) {
            this.name = name;
            this.mail = mail;
            this.phone = phone;
            this.jobs = task;
        }
    }
