package 조건문복습;

import java.util.Scanner;

//세자리 정수 중 큰 수 찾기
//백의 자리 숫자
public class IntegerEX {
    public static void main(String[] args) {
        int num;
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("백의 자리 정수를 입력하시오 : ");
        num = sc.nextInt();
        a = num / 100;
        b = (num % 100) / 10;
        c = num % 10;

        if(a > b) {
            if (a > c) System.out.println(a);
            else System.out.println(c);
        } else {
            if (b > c) System.out.println(b);
            else System.out.println(c);
        }
    }
}
//이걸 삼항연산자로 표현하면 어떻게 할 수 있을까?