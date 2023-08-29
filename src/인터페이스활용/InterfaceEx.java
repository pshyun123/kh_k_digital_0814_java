package 인터페이스활용;

public class InterfaceEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; //customer참조변수를 buy interface형에 대입
        buyer.buy(); //Customer가 Buy,Sell 자기참조???

        Sell seller = customer;
        seller.sell();
        Customer customer2 = (Customer) seller; // 부모형으로 바꿨던 걸 자기형으로 바꿈. 다운캐스팅
        customer2.buy();
        customer2.sell();

        //업캐스팅은 자주하는데 다운캐스팅은 자주 하지 않음.
        //인스턴스 of



    }
}
