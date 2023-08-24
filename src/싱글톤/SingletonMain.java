package 싱글톤;
//객체가 한번만 생성되는 것
public class SingletonMain {
    public static void main(String[] args) {
        TestObject1 member1 = new TestObject1();
        TestObject2 member2 = new TestObject2();
        member1.setInfo("동글",27);
        member2.viewInfo();


    }
}
