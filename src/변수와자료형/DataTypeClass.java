package 변수와자료형;
// 변수란 값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것

public class DataTypeClass {
    public static void main(String[] args) {
        int age; //정수형 변수 선언, 4바이트(32bit) 공간을 확보하고 초기 값은 아직 없음.
                 // 정수 값을 저장하는 목적, 소수 점 이하가 없음, 음수와 양수 존재
        double value; // 실수 값을 저장하기 위한 변수 선언

        char gender = 'M'; //선언과 동시에 초기화, gender라는 변수에 문자 M 대입
                           //char 문자 표현하기 때문에 음수가 없다.

        //논리형 변수 선언 : 참, 거짓을 판별하기 위해서 사용하는 자료형.
        boolean isTrue = true; //됨, true false의 예약어만 사용가능

        //정수형 변수 선언 : 소수점 이하가 없고 양수와 음수가 존재
        //byte와 short는 쓸 일이 없다. int 가 제일 빠름
        byte bNum;  // 1 Byte 크기의 변수 선언. b는 Byte의 약자, 1Byte == 8bit
        short sNum; // 2 Byte 크기의 변수 선언.
        int iNum;   // 4 Byte 크기의 변수 선언.
        long lNum;  // 8 Byte 크기의 변수 선언. 64bit

        //실수형 선언
        //근사치의 계산만 실행. 조건문에 쓸 수 없다.(정확한 값이 안 떨어지기 때문에). 정수를 사용.
        float fNum;  // 4 Byte
        double dNum; // 8 Byte, 기본이 더블형

        int num1, num2; // 같은 타입의 변수를 동시에 선언할 수 있음(콤마로 구분)
        double num3 = 3.14; //선언과 동시에 값을 초기화 함
        double num4 = 1.23, num5 = 4.56;
        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시간" + minute +"분");
    }

}
