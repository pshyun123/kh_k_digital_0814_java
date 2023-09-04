package 예외처리;
// 기본적으로 자바는 수많은 예외클래스 존재. 사용목적에 맞는 예외처리 없는 경우 직접 만든다.
public class CostomException {
    public static void main(String[] args) throws EvenException {

        CheckEven ce = new CheckEven();
        try{
        int num1 = 100;
        int num2 = 99;
        System.out.println(ce.printEven(num1)); // 100이 짝수인지 아닌지
        System.out.println(ce.printEven(num2));
    } catch(EvenException e) {
        e.printStackTrace();
     }
   }
}
class EvenException extends Exception {//실제 예외 발행할 클래스 제작
    private Integer number = null;
    public EvenException(int number){
        this.number = number;
    }
    @Override
    public String getMessage() {
        if(number == null) return "숫자 아님";
        else return number + "는 짝수가 아닙니다.";//getmessage가 요구하는 것.
    }
}
//실제 체크
class CheckEven{
    private int num;
    public void setNum(int num) {
        this.num = num;
    }
    public int printEven(int number) throws EvenException {
        this.num = number;
        if(num % 2 != 0) throw new EvenException(num); //나누어서 0이 아니면 예외처리
        else return num;
    }
}
