package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

// 전원 ON / OFF
// 온도설정기능
// 현재 온도 표시 기능
// Cooler ON / OFF
// Heater ON / OFF
// 바람세기 : 1,2,3단
public class AirCon {
    //두가지 값이 있는경우는 boolean 쓰는게 좋다
    private boolean isPower; // ON OFF
    private int setTemp; //온도 설정
    private int currTemp; // 현재온도
    private boolean isCooler; //냉방기
    private boolean isHeater; //난방기
    private int windStep; //1,2,3단
    AirCon(){

        //에어컨의 현재 온도를 보여주기 위한 값
        final int[] MONTHTEMP = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2};
        Calendar now = Calendar.getInstance(); //캘린더 클래스에서 스테틱 메소드 끌고옴
        int month = now.get(Calendar.MONTH); //배열의 인덱스와 동일, 대문자 MONTH=스테틱 필드
        currTemp = MONTHTEMP[month]; //달에 대한 정보만 가져옴, 현운영체제의 날짜 읽음//그리니치 천문대

        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;

    }
    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF"; //삼항연산자
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재온도는 " + currTemp + " 입니다.");
        System.out.print("온도를 설정하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정온도는 " + setTemp + " 입니다.");
        System.out.println("바람세기를 설정하세요. (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if(currTemp > setTemp) { //설정온도가 현재 온도보다 낮은 상태. 즉 더운상태
           System.out.println("Cooler가 동작합니다.");
           isCooler = true;
           isHeater = false; //명확하게
        } else if(currTemp < setTemp) {//설정온도가 현재 온도보다 높은 상태. 즉, 추운상태
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
        //잘못입력하는 경우 없다고 가정하고
    }
    //세터와 게터 넣어주기
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep; //이거 하다가 위에 private 걸어줌
    }
    public boolean isHeater() { //히터 켜져있니? is로
        return isHeater; // 메소드와 내부필드의 이름이 같아도 상관없음/불리언타입에서
    }
    public boolean isCooler() { //쿨러 켜져있니?
        return isCooler;
    }
    public void setCurrTemp(int n) { // 매개변수의 정수값을 받아 현재 온도를 변경해줌
        currTemp += n;
    }
    public int getCurrTemp() { //현재 온도를 읽는 메소드
        return currTemp;
    }
    public int getSetTemp() { //설정 온도를 읽는 메소드
        return setTemp;
    }
}
