package 열거타입2;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이사육사", DevType.FRONTEND, Career.SENIOR, Gender.MALE);
        //정해지지 않은 설정값은 못 받는 단점 있지만 아닌 경우 강력한 장점, 예외처리 안해도 되니까~
        developer.devInfo();

    }
}
