package 싱글톤;

public class Singleton {
    String name;
    int id;


    //클래스 내에서 단 한 번 객체를 생성하고
    private static Singleton singleton = new Singleton();//여기부터 달라짐(static 안붙여도 됨)
    private Singleton() {//외부에서 생성자를 호출하지 못하게 접근제한 함
        name = "test";
        id = 100;
    }


    //한번 만들어진 객체에 대한 주소를 반환 함.
    static Singleton getSingleton(){
        return singleton; //딱한번만 호출 받음

    }
}
//00