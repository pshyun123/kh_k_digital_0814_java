package 참조타입기초;
//자바의 데이터 타입은 기본 타입/참조타입으로 나누어집니다.
//기본타입 : 정수, 실수, 문자, 논리값 등을 저장하는 타입.(실제 값이 변수에 저장됨)_String 제외하고 전부 기본타입
//참조타입 : 객체의 주소를 변수에 저장.(배열, 열거형, 인터페이스, 클래스, 문자열)

public class Reftype {
    public static void main(String[] args) {
        //기본타입 예제
        int age = 35; //int 형으로 만들어진 age라는 변수에 25라는 값을 저장
        double price = 100.5; // double 형으로 만들어진 price 변수에 100.5라는 값을 저장
        //참조타입 예제
        String name = "곰돌이사육사"; //String 형으로 만들어진 name에는 실제 "곰돌이사육사"라는 문자열이 없고 주소가 있음
        //*왜 대문자? 객체타입이라서,


//        Integer boxedValue = null; //*int 타입에 대한 참조타입, 주소가 들어가야함
//        int intValue = boxedValue;
//        System.out.println(intValue); //객체타입과

        String strVal1 = "나희도"; //리터럴 상수로 고정 됨
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); //heap 영역에 메모리 공간을 확보 함

        //참조변수에서 ==, != (주소가 같은지를 물어 보게 됨)
        //val1,2는 주소 같음

        if (strVal1 == strVal2) { //주소가 같은지 물어봄
            System.out.println("strVal1과 strVal2는 참조하는 주소가 같음");
        } else {
            System.out.println("strVal1과 strVal3는 참조하는 주소가 같음");
        }
        if (strVal1.equals(strVal3)) //포함된 내용, 즉 문자열이 같은지 물어봄
            System.out.println("strVal1과 strVal3는 내용이 같음");
    }
}
