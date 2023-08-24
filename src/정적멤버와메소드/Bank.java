package 정적멤버와메소드;

public class Bank {
    private static int count = 0; // 정적필드, 객체로 생성되지 않음
    private int account; // 계좌
    private String bank; // 은행 이름
    Bank(String name, int account){
        count++; // 계좌가 몇개 만들어지는지
        this.bank = name;
        this.account = account;
        System.out.println(bank + "은행에 계좌를 개설합니다. 잔액은 " + this.account + "입니다.");
    }
    public static int getCount() { // 정적 메소드, 객체로 만들어지지 않음,
                                   // 힙에 올라갈때 정적메소드는 빠지고 올라감
        return count;
    }
    public void setDeposit(final int dep){ //final 붙이는 이유? dep금액 절대 바뀌지 않도록.
        this.account += dep;
        System.out.println(dep + "을 예금했습니다.");
    }
    public void setWithDraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 " + account + "원 입니다.");
    }
}
//00