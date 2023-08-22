package 요금제계산;
// 영식 요금제 : 30초당 10원 (30초가 되면 2통이 됨)
// 민식 요금제 : 50초당 15원
// 첫번째 줄에 통화의 횟수(20회 미만), 두번째 줄에 통화당 통화시간(초단위)
// 출력은 싼 요금제를 출력. 영식요금제는 Y60, 민식요금제는 M45
// 총 통화요금이 같은 경우는YM 총 통화요금 표시

import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {


        int[] call = new int[20]; //통화횟수에 대한 통화시간을 입력받기위한 배열, 굳이 갯수제한 안걸어도 되는데.. 그럼 arraylist로
        int yPay = 0, mPay = 0; //변수를 여기다 만드는 이유는 누적받기 위해서 =0을 해서 초기화도 해줌
        Scanner sc = new Scanner(System.in);
        System.out.println("통화횟수 입력 : ");
        int n = sc.nextInt();
        System.out.println("통화시간 입력 : ");

        int cnt = sc.nextInt(); // 통화횟수를 입력받아 변수에 대입
        for(int i = 0; i < cnt; i++) { //통화횟수당 통화시간을 입력받음
            call[i] = sc.nextInt();
        }
        //총 통화요금 구하기
        for(int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 +10; // 10초마다 금액, 기본요금+10
            mPay += (call[i] / 60) * 15 +15; //
        }
        if(yPay > mPay){
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y" + yPay);
        } else {
            System.out.println("YM" + yPay);
        }



//
//
//
//
//        for(int i = 0; i < n; i++){
//            call[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++) {
//            yPay += (call[i] / 30) * 10 + 10;// 10초마다 금액, 기본요금+10
//            mPay += (call[i] /60) * 15 + 15;
//        }
//        if(yPay > mPay) {
//            System.out.println("M" + mPay);
//        } else if (yPay < mPay) {
//            System.out.println("Y" + yPay);
//        } else {
//            System.out.println("YM" + yPay);
//        }
    }
}
