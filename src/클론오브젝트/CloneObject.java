package 클론오브젝트;
//얕은 복사때문에 필요.

public class CloneObject {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "123465", 20, true);
        Member mem2 = mem1; //
        mem1.viewInfo();
        mem2.name = "KH";
        mem2.password = "KKKKKKK";
        mem2.viewInfo();
    }
}
