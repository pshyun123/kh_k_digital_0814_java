package 예외처리;

import java.util.Scanner;

//
public class Exception4_Arithmetic {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true) { //탈출문 있어야 함
            System.out.println("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없음. 다시입력");
                continue; //
            } finally { //예외에 상관 없이 무조건 수행되는 구문 캐치다음에 수행
            System.out.println("결과 : " + rst);
            break;
            }
        }
    }
}
