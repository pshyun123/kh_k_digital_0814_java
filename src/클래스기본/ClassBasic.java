package 클래스기본;

public class ClassBasic {
    public static void main(String[] args) {
        //메소드에 public 붙어있음 공용의. 접근제한이 없음
        Student s1 = new Student();//student클래스에 대한 참조변수 s1에는 실제 값이 아닌 주소가 저장.
        //new 힙메모리에다가 동적할당(run time)((
        //동작중에 할당.//Student
        System.out.println(s1.setName("곰돌이사육사"));
        s1.setAddr("경기도 수원시");
        s1.showInfo();

        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");
        s2.showInfo();

        Student s3 = new Student();
        s3.setName("유나");
        s3.setAddr("수원시 팔달구");
        s3.showInfo();


    }
}
