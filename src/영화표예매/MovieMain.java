package 영화표예매;

import java.util.Scanner;

// 간단한 영화표 예매 시스템
// 사용자 극장의 좌석을 선택, 판매된 좌석의 개수만큼 판매금액을 계산
// 1. 예매하기, 종료하기 메뉴 만들기//종료하기 선택시 총 판매금액을 계산함) main에서 구현
// 2. 극장의 좌석은 10개
// 3. 각 좌석당 금액은 12,000원
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket Ticket = new MovieTicket(13000); //생성자를 추가함. 좌석당 가격을 저장 할 수 있음.
        Scanner sc = new Scanner(System.in);
        while (true) { //언제 종료할 지 모르니까 계속
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            System.out.print("=> ");
            if (sc.nextInt() == 1) Ticket.selectSeat();
            else {
                System.out.println("총 판매금액 : " + Ticket.totalAmount());
                break;
            }
        }
    }
}

