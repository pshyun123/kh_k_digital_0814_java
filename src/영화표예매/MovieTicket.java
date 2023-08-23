package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    // 좌석의 개수
     int seat[] = new int[10]; //인스턴스 필드
    int ticketPrice;
    MovieTicket(int price){
        ticketPrice = price;
    }
    //판매된 좌석의 개수를 확인. 총 판매 금액을 구해서 반환
     int totalAmount() {
         int cnt = 0; //지역변수
         for (int val : seat) {//val이라는 변수는 seat라는 배열을 처음~마지막까지 자동 순회하는 요소
             if (val == 1) cnt++; // val이 1이면 판매된 좌석이라는 의미
         }
         return cnt * ticketPrice; // 반환값이 int형임.
     }
     void printSeat() { // 선택가능한 좌석의 리스트를 보여줌
         for (int s : seat) { //향상된 for 문
             if (s == 0) System.out.print("[  ]"); // 미판매 좌석
             else System.out.print("[V]"); // 판매완료 좌석
         }
         System.out.println();
     }
     void selectSeat() { // 좌석을 판매하는 메뉴
         printSeat(); //좌석 상태를 보여주는 메소드 호출
         Scanner sc = new Scanner(System.in);
         System.out.print("좌석을 선택하세요. : ");
         int selSeat = sc.nextInt(); // 사용자가 선택한 자료를 입력 받음(사용자는 시작이 0이 아니라 1부터 생각함..)
         if(seat[selSeat - 1] == 0) { //사용자가 선택한 좌석이 판매되었는지 확인.
             seat[selSeat - 1] = 1;//판매가 안 된 좌석이기 때문에 판매 함
         } else System.out.println("이미 판매된 좌석입니다. 다른 좌석을 선택해주세요.");

     }
}

