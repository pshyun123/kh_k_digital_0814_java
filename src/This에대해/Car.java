package This에대해;

public class Car { // Car car = new Car();
    private String model; // 자동차 명
    private int year;     // 출고 연도
    private String color; // 색상
    private int maxSpeed; // 최고 속도
    Car() {}
    Car(String model) {
        this(model, 2022, "black", 230);
    //아래 적혀있는 다른 생성자를 부를 수 있다. 이렇게 안쓰는 편.
    }
    Car(String model, int year, String color, int speed){
        this.model = model;//this가 숨어있음. 이름이 같을때 매개변수와 인스턴스 필드 식별할 수 있게
        //this가 클래스를 참조하는게 아니라 객체를 참조한다.  private String model 얘랑 구분
        this.year = year;
        this.color = color;
        maxSpeed = speed; // 여기선 식별 가능해서 this 안써도 된다.

    }
}
