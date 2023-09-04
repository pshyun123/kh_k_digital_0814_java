package 메소드참조2;

import java.util.function.ToIntBiFunction;

// ToIntBiFunction<String, String> : 두개의 문자열을 입력 받고 int 값을 리턴
// compareToIgnoreCase() : 두 문자열을 대소문자와 상관없이 동일한 알파벳으로 구성되어 있는지 비교
public class MethodRef2 {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;
//        function = (a,b) -> a.compareToIgnoreCase(b);
//        print(function.applyAsInt("Java8", "JAVA8"));

        function = String ::compareToIgnoreCase;
        print(function.applyAsInt("java8", "JAVA8"));
    }
    static void print(int order) {
        if (order < 0) System.out.println("사전순으로 먼저 나옵니다.");
        else if (order == 0) {
            System.out.println("동일한 문자열입니다.");
        } else {
            System.out.println("사전순으로 나중에 나옵니다");
        }
    }
}

