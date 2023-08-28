package 자동차만들기종합;

import java.util.Scanner;

public class SirCarMain {
    public static void main(String[] args) {

        //1부산,2대전,3강릉,4광주
        final  int [] dist = {0, 400, 150, 200, 300};
        SirCar car = null;
        Scanner sc =new Scanner(System.in);
        System.out.print("이동지역  [1]부산 [2]대전 [3]강릉 [4] 광주");
        int city = sc.nextInt();
        System.out.print("이동 승객 수 : ");
        int passCnt = sc.nextInt();
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carSel = sc.nextInt();
        System.out.print("부가기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch (carSel) {
            case 1 : car = new SportsCar("포르쉐");break;
            case 2 : car = new Sedan("제네시스");break;
            case 3 : car = new Bus("고속"); break;
            default: System.out.println("차량 선택이 잘 못 되었습니니다.");
        }
        car.setMode(isMode); // 모드 On, off
        int moveCnt = car.getMoving(passCnt);
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7) );
        System.out.println("총 비용 : " + car.getTotalCost(dist[city], moveCnt));
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[city], moveCnt));
        System.out.println("총 이동 시간 : " + car.getMovingTime(dist[city], moveCnt));
    }
}
