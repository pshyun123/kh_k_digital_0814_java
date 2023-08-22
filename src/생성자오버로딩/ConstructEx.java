package 생성자오버로딩;

public class ConstructEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();

        Car santafe = new Car("싼타페");
        santafe.carInfo();

        Car avante = new Car("아반떼", "화이트");
        avante.carInfo();

        Car grandure = new Car("그랜저", "블랙", 220);
        grandure.carInfo();

        Car tusan = new Car("투싼", "레드", 210);

    }
}
