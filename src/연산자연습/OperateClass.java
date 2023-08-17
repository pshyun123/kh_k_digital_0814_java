package 연산자연습;

import java.util.Scanner;

//산술연산자 : 사칙연산과 나머지 연산자
public class OperateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
//        System.out.println("덧셈 : " + (num1 + num2));
//        System.out.println("뺄셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " + ((double)num1 / num2));
//        System.out.println("나머지 : " + (num1 % num2)); // 알고리즘에서 아주 중요! 많이 쓰인다
//        System.out.println("몫 : " + (num1 / num2));

//        //대입연산자 : 변수에 값을 대입하는 연산자(=), 프로그램에서 =는 같다라는 의미 아니고 대입한다는 의미
//        System.out.println(num1 +=2); //복합대입연산자 : num1 =num1 + 2;
//        System.out.println(num1 -=2); //복합대입연산자 : num1 =num1 - 2;
//        System.out.println(num1 *=2); //복합대입연산자 : num1 =num1 * 2;
//        System.out.println(num1 /=2); //복합대입연산자 : num1 =num1 / 2;
        //관례상 덧셈 뺄셈까지만, 곱셈은 잘 사용하지 않음


        //증감연산자 : 단항연산자, 피연산자의 값을 1증가 또는 1감소 시키는 연산자

//        int tmp = num1++;
//        System.out.println(tmp);
//        System.out.println(num1);

        //비교연산자 : 두개의 피연산자를 비교해서 어느쪽이 큰지를 판단
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
//        System.out.println(x > y); //false
//        System.out.println(x > y); //true
//        System.out.println(x == y); //false
//        System.out.println(x ! y); //true
//        System.out.println(x >= y);//true
//        System.out.println(x <= y); //true

        //논리연산자 : &&(And 연산자, 둘 다 참인 경우 참), ||(OR연산자, 둘중 하나만 참이면 참)리액트에서 &&연산자 많이 사용한다.
        // ! : NOT 연산자, 현재가 참이면 거짓, 거짓이면 참
//        rst1 = ( x > 0 ) && (x > y); //거짓
//        rst2 = ( x > 0 ) || (x > y); //참
//        rst3 = !( x > 0 ) || (x < y); //참
//        System.out.println(rst1 + "" + rst2 + "" + rst3);


        //삼항연산자 : 3개의 피연산자를 필요로 하는 연산자
//        Scanner sc = new Scanner(System.in); //키보드로 입력을 받기 위해서
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false;
//        System.out.println(isAdult);

        //문자열 결합 연산자
        System.out.println("Java" + 18.04 + 12); //문자열 먼저와서 문자로 인식
        System.out.println( 3 + 3.3 + "JDK");

        //연산자 우선순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;

        result1 = val1 + val2 * val3;     //30
        result2 = (val1 + val2) * val3;   //50
        result3 = val1 + (++val2) * val3; //35

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);




    }


    }

