package 다중인터페이스;

public class NewCar {
    protected int speed;
    //protected 많이 쓰는 이유? 상속을 주기위한 것이라는 것 명시하고자
    //상속관계가 성립되면 접근가능
    protected String color;
    protected String year;
    public NewCar() {
        speed = 150;
        color = "white";
        year = "1999";
    }
}
