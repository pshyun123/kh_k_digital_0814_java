package 클래스기본;
//클래스에서 각각의 동작 만들고, 메인에서 구현

public class Student {
   private int id;        //학번, 인스턴스 필드라고 부름
     String name;         //이름
    private int grade;     //학년
    private String addr;   //주소
    //private붙여서 캡슐화. 외부에서 해당필드에 대한 접근 막음
    public void showInfo() {
        System.out.println(name + ", "+ addr);
    }
    //Setter 메서드

    public boolean setName(String name) {
        this.name = name;
        return (true);
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

