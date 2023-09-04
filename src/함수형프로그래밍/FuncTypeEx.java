package 함수형프로그래밍;
// 함수형 프로그래밍은 자바 8에서 도입
// 자료처리를 수학적 함수의 계산으로 취급하고 상태와 가변데이터를 멀리하는 프로그래밍 패러다임
// 자바에서 함수형프로그래밍 애매함 -> ? 자바는 함수 사용 불가. 함수와 메소드 차이, 모든 것이 독립적으로 존재불가

//첫번째. 객체지향 코드로 만들기 -> 복잡하다
interface Calculator {
// sum 사용해야하는데 자바에서는 사용할 수 없어서 인터페이스로 감싸줌
    int sum(int a, int b);
}
//class MyCalculator implements Calculator{
//    @Override
//    public int sum(int a, int b){
//        return  a+b;
//    }
//}
// 람다식으로 변환
public class FuncTypeEx {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(3,4);
        Calculator mc = (int a, int b) -> a + b;
        // 이거 추가, 인터페이스 상속을 받아 클래스 대신 람다식을 사용
        int result = mc.sum(3,4);
        // 이거 추가
        System.out.println(result);
    }
}
