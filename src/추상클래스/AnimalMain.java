package 추상클래스;

public class AnimalMain {
    public static void main(String[] args) {


//AnimalClass animalClass = new AnimalClass();
        Cat cat = new Cat();
        cat.cry();
        cat.sleep();

        Dog dog = new Dog();
        dog.cry();
        dog.sleep();
        //추상클래스 참조변수로 상속객체를 접근(자주 사용됨)
        AnimalClass animal = new Cat();
        animal.sleep();


    }
}