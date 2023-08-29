    package Object클래스;

    import 시스템출력.SystemOut;

    //toString() : 해당 인스턴스에 대한 정보를 문자열로 반환
    // 클래스이름 @ 해시코드 (객체의 메모리 주소를 이용해 해시코드 생성)
    // toString() 메소드는 오버라이딩해서 사용가능하며 String, Integer의 경우에는 오버라이딩 되어있음
    public class ObjectClass {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = car01;
//        Car car02 = new Car();
//        System.out.println(car01.toString());
//        System.out.println(car02.toString());
//        String test = "곰돌이사육사"; //객체타입. 원래 주소가 찍혀야
//        Integer test2 = 2300;       //객체타입. 원래 주소가 찍혀야
//        int test3 = 4500;
//        System.out.println(test);
//        System.out.println(test2);//원래는 주소가 떠야하는데, 오버라이딩해서 실제값을 찾아줌
        //equals() 메소드 : 인스턴스매개변수로 전달받는 참조변수와 비교하여 그 결과를 반환
        //해시코드 값을 묻는 것(메모리 코드가 같은지)
        System.out.println(car01.equals(car02));


    }
}
    class Car {

    }
