package 디폴트메소드중복;

public interface Buy {
    void buy(); // public abstract 자동으로 추가됨
    default void order() { //예외적으로 구현부를 가짐(부모가 실체가 있는 메소드)
        System.out.println("구매주문");
    }
}

interface Sell{
    void sell();
    default void order() {
        System.out.println("판매주문");
    }//order가 양쪽에 다 있음 모호하다고 판단.
}

class Customer implements Buy, Sell{
    //order는 누구것인지 모름. 다이아몬드 상속처럼

    @Override
    public void buy() {

    }

    @Override
    public void order() {
        Sell.super.order();
        Buy.super.order(); //부모걸 둘다 명시적으로 불러옴/오버라이딩 꼭 해줘야 함. 모호성해결

    }
    @Override
    public void sell() {

    }
}