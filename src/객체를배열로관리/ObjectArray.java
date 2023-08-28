package 객체를배열로관리;
//객체를 집어넣는 경우
//정수일 경우는 그냥 넣으면 되는데 방 만들어주고 넣는다
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt];// 배열에 대한 변수. cnt크기만큼 비워진 상태
        System.out.println("=".repeat(5) + "정보입력" + "=".repeat(5));
        for(int i = 0; i < nameCards.length; i++){ //아직 값이 안들어 와있음
            nameCards[i] = new NameCard();
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());//나이는 정수
            System.out.print("이메일 : ");
            nameCards[i].setMail(sc.next());
            System.out.print("연락처 : ");
            nameCards[i].setPhone(sc.next());
        }
        //향상된 포문 앞은 뒤는
        for(NameCard card : nameCards){
            card.printInfo();
        }
    }
}
