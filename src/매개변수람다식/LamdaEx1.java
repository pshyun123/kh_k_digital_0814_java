//package 매개변수람다식;
//@FunctionalInterface
//// 함수형 프로그램을 만들기 위한 어노테이션(안붙여도 되지만 명시적으로 보여주려고)
//// 내부의 함수가 하나만 존재
//interface MyFuncInterface {
//    void method(int x);
//    // 지금 익명의 함수로 구현하겠다. 자바는 함수만 존재할 수 없어서 인터페이스 걸었음
//    // 상속을 위한게 아니고 함수를 위해 있다는걸 명시적으로 확인
//}
//@FunctionalInterface // 리턴값이 있는 람다식
//interface MyfuncInterface2{
//    int min(int x, int y);
//}
//public class LamdaEx1 {
//    public static void main(String[] args) {
////        MyFuncInterface fi = x -> {// 매개변수가 한개인 경우 () 생략가능
////            int result = x * 5;
////            System.out.println(result);
////        }; // x가 매개변수를 받음. 구현부가 한줄인 경우 {} 생략가능,;구현부 끝에 꼭
////        // 구현 끝 불러주기~, 일회용
////        fi.method(10); // 10 * 5
//        //
//        MyFuncInterface fi2 = (x, y) -> x < y ? x : y; //구현부가 한줄인 경우 {} 생략가능
//        System.out.println(fi2.min(3,4));
//    }
//}
