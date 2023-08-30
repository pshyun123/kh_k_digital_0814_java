package 제네릭연습2;

public class GenericPrinter<T> {
    private T material; // T자료형으로 변수 선언. 데이터타입 아직 결정안됨
    public void setMaterial(T material) {//매개변수로 타입을 전달받음
        this.material = material;

    }
    public T getMaterial() {
        return material;

    }
}

class Powder {
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");

    }
    public  String toString() {
        return "재료는 파우더";
    };
}
class  Plastic {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
    public  String toString() {
        return "재료는 플라스틱";
}
}