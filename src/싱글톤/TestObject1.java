package 싱글톤;

public class TestObject1 {
    Singleton single = Singleton.getSingleton(); //주소 가지고 옴
    void setInfo(String name, int id) {
        single.name = name;
        single.id = id;
    }//값 바꾸기
    void viewInfo() {
        System.out.println("이름 : "+ single.name);
        System.out.println("아이디 : "+ single.id);
    }
}

