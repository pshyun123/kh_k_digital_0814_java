package 계산기만들기;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        int x,y; // 좌변과 우변
        char op; // 연산자
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력 : ");
        x = sc.nextInt(); // 정수값 입력 받고 띄어쓰기 발생하면 다음줄로 넘어감
        op = sc.next().charAt(0); //
        y = sc.nextInt();
        switch (op) {
            case  '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case  '-' :
                System.out.println("뺄셈 : " + (x - y));
                break;
            case  '*' :
                System.out.println("곱셈 : " + (x * y));
                break;
            case  '/' :
                System.out.println("나눗셈 : " + ((double)x / y));
                break;
            default:
                System.out.println("연산자를 잘 못 입력하였습니다. ");
        }

    }
}
