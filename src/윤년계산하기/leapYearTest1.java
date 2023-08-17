package 윤년계산하기;
//윤년의 조건
//1. 연도가 4로 나누어 떨어진다._4의 배수
//2. 100으로 나누어 떨어지면, 연도는 윤년이 아니다.
//3. 400으로 나누어 떨어지면, 윤년이다.


import java.util.Scanner;

public class leapYearTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            //4의 배수를 4로 나누어 나머지가 0, 100으로 나누어 떨어지면 안 됨, 400의 배수이거나
            System.out.println(year + "는 윤년입니다.");
            //조건이 참인 경우 수행되는 구간

        } else {
            System.out.println(year + "는 윤년이 아닙니다.");
            //조건이 거짓인 경우 수행되는 구간
        }
    }
}
