package 예외처리;
//NullPointExcepiton (NPE) : 자바에서 발생하는 대표적인 런타입 에러. 참조하려는 객체가 없는 경우 발생
public class Exception3_null {
    public static void main(String[] args) {
        //=====잘못된 처리=====
//        Test test = new Test();
//        try{
//        String testStr = test.name;
//        System.out.println(testStr);//얘를 못만나고
//        //참조변수를 받았는데 내용이 없는 상태로 받아버리면 널포인트 이셉션
//    } catch(NullPointerException e) {
//        System.out.println("NPE 발생");//얘만 실행
//        }

        //=====옳은 처리 방법=====-조건문 걸어서 처리
        Test test = null;
        if(test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        } else {
            System.out.println("testrk null 입니다.");
        }
    }
}
class Test {
    String name = "곰돌이 사육사"; //인스턴스화 되지 않았음

}