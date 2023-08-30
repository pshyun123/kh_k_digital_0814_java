package 제네릭연습1;

public class GenericEx1 {
    public static void main(String[] args) {
//        Person<String> p1 = new Person<>("안유진");
//        System.out.println(p1.info);
//        Person<Integer> p2 = new Person<>(21);
//        System.out.println(p2.info);

        //멀티타입 파라미터
        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("SmartTV");
        pr1.setYear(2023);
        System.out.println(pr1.getName() + " " + pr1.getYear());

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(123456);
        pr2.setYear("2023");
        System.out.println(pr2.getName() + " " + pr2.getYear());
    }
}

class Product<T,M> {
    private T name;
    private M year;

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }

    public T getName() {
        return name;
    }
}

class Person <T> { //자료구조를 만들고 타입변수 넣어준다. 대문자로->원형
   public T info;
   Person(T name){ //타입자체가 변수
       this.info = name;
   }
}