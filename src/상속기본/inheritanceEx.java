package 상속기본;
//상속 : 자식 클래스가 부모클래스의 기능을 물려받는 것
//키워드 : extends
public class inheritanceEx {
    public static void main(String[] args) {
//        Dog dog = new Dog(); //Animal로 상속받음
//        dog.setName("poppy");
//        dog.sleep();
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep(10);
    }
}
