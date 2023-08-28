package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //이동지역
        System.out.println("이동 지역 선택:  [1]부산 [2]대전 [3]강릉 [4] 광주");
        int setLoc = sc.nextInt();

        //승객수
        int seatCount = 0;

        while (true) {
            System.out.println("승객수 : ");
            seatCount = sc.nextInt();
            if (seatCount > 200 || seatCount < 1) {
                System.out.println("승객 수가 수용 범위를 초과하였습니다.");
            } else break;
        }
        //차량선택
               System.out.print("자동차를 고르세요: [1]스포츠카 [2]승용차 [3]버스");
        int carSel = sc.nextInt();
       //부가기능
        System.out.println("부가기능 : [1]ON [2]OFF");
        int setExtra = sc.nextInt();

        switch (carSel) {
            case 1:
                SportsCar sportsCar = new SportsCar("페라리");

               //부가기능 ON OFF
                if (setExtra == 1) {
                    sportsCar.isExtra(true) ;
                }else sportsCar.isExtra(false);

                sportsCar.setArea(setLoc);
                sportsCar.setSeatCount(seatCount);
                sportsCar.setTotalC();
                sportsCar.setTotalD();
                sportsCar.setRefill();
                sportsCar.setcost();
                sportsCar.setTime();
                sportsCar.getInfo();
                break;

            case 2:
                Sedan sedan = new Sedan("세단");

                //부가기능 ON OFF
                if (setExtra == 1) {
                    sedan.isExtra(true) ;
                }else sedan.isExtra(false);

                sedan.setArea(setLoc);
                sedan.setSeatCount(seatCount);
                sedan.setTotalC();
                sedan.setTotalD();
                sedan.setRefill();
                sedan.setcost();
                sedan.setTime();
                sedan.getInfo();
                break;

            case 3:
                Bus bus = new Bus("버스");

                //부가기능 ON OFF
                if (setExtra == 1) {
                    bus.isExtra(true) ;
                }else bus.isExtra(false);

                bus.setArea(setLoc);
                bus.setSeatCount(seatCount);
                bus.setTotalC();
                bus.setTotalD();
                bus.setRefill();
                bus.setcost();
                bus.setTime();
                bus.getInfo();
                break;



        }

    }

}
