package 메소드참조;

import java.util.function.IntBinaryOperator;

// 메소드 참조는 메소드를 참조해서 매개 변수의 정보 및 리턴 타입을 알아냄.
// 불필요한 매개 변수를 제거하는 것이 목적
class Calculator {
    public static int staticMethod(int x, int y){
        return x + y;
    }
    public int instanceMethod(int x, int y) {
        return x + y;
    }
}
public class MethodRef {
    public static void main(String[] args) {
        IntBinaryOperator operator; // 모든 사람이 동일하게 코드 구현하기 쉽게 메소드를 지정.
        // IntBinaryOperator: 두개의 int 연산해 수행한 결과를 반환

        // 람다식 사용
        operator = (x,y) -> Calculator.staticMethod(x,y);//두개 값을 받아 메소드로
        System.out.println("결과1 : " + operator.applyAsInt(1,2));//.applyAsInt??

        // 정적 메소드 참조
        operator = Calculator :: staticMethod; // 스코프 연산자와 비슷, 매개변수 생략가능
        System.out.println("결과2 : " + operator.applyAsInt(3,4));

    }
}
