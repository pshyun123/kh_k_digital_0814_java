package 열거타입2;

enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA, BIGDATA
}
enum Career{
    JUNIOR, SENIOR
}
enum Gender{
    MALE, FEMALE
}
public class Developer {
    private String name;
    private DevType type; //개발분야
    private Career career;
    private Gender gender;


//생성자 자동으로 만들어 준다.
    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
    //결과
    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);

        //강력한 타입제한을 걸어두니 더 깔끔하다.
    }
}
