package 클론오브젝트;
//clone()은 Cloneable 인터페이스를 상속받은 경우에만 가능
public class Member implements Cloneable {//인터페이스 상속받았는데 오류뜨는게 하나도 없음
    String id;
    String name;
    String password;
    int age;
    boolean adualt;
    void viewInfo() { //결과 찍는 것
        System.out.println("ID " + id);
        System.out.println("이름 " + name);
        System.out.println("비밀번호 : " + password);

    }


//우클릭 - 생성 - constructor
    public Member(String id, String name, String password, int age, boolean adualt) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adualt = adualt;
    }
    public  Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메소드 자체는 Object 클래스 타입이므로 형변환
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return cloned;
    }
}
