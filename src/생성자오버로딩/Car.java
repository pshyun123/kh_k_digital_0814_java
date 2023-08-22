package 생성자오버로딩;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int speed;
     int horsePower; //인스턴스 필드에 대한 메서드

    //생성자는 클래스이름과 같다.
    Car() {}

    Car(String model){
        this.model = model;
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int speed){
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed, int horsePower){
            this.model = model;
            this.color = color;
            this.speed = speed;
            this.horsePower = horsePower;
    }
        //생성자를 따로 만들지 않으면 기본 디폴트 생성자가 숨어있음
            //model = modelName;
    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }

}



















