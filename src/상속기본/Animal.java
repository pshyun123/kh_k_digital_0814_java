package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;

        //같은패키지가 아니면 참조가 안됨
    }
}
//Animal을 상속받아 Dog class만듦
class Dog extends Animal {
    void sleep() { //부모의 sleep
        System.out.println(this.name + " zzz");
    }
}
class HouseDog extends Dog {
    void sleep() { //있는 걸 재정의 하는게 오버라이딩,이게 우선순위
        System.out.println(this.name + "zzz in house");
    }
    void sleep(int hour) { //오버라이딩 한걸 다시 오버로딩
        System.out.println(this.name + "zzz in house for " + hour + " hours" );
    }
}
