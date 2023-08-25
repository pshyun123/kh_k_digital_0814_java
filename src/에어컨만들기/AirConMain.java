package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep; //sleep걸면 이렇게

//메인 복잡
public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon(); //객체 생성
        int elapsedTime = 0; //경과시간을 계산하기 위한 변수
        boolean isSetTemp = false; //온도를 변경하할 조건인지 판단하는 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("에어컨을 켜시겠습니까? (yes / no) :");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("yes")){
            lgAirCon.setPower(true);
            lgAirCon.setAirConState();
            while (true){
                sleep(1000); //alt shift enter로 입력하자!1초 대기
                elapsedTime++;//1초마다 경과시간 올라감
                switch (lgAirCon.getWindStep()){ //온도를 바꾸는 조건
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break;//1단
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;//2단
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;//3단
                    default: if(elapsedTime >= 61) isSetTemp = true;
                }
                if(isSetTemp) {
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false; //온도 변경이후 초기화
                    elapsedTime = 0; //온도 변경이후 초기화
                    //온도 바뀔때마다 화면에 보여주기
                }
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()){
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }

    }

}
