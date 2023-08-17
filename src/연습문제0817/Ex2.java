package 연습문제0817;
//세자리 정수 중 큰 수 찾기
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int num; //백의 자리 정수 입력을 받기 위한 변수
        int a,b,c; //100, 10, 1의 자리 값을 담기 위한 변수
        //입력을 받기 위한 스캐너
        Scanner sc = new Scanner(System.in);
        System.out.print("백의자리 정수 입력 : ");
        num = sc.nextInt();
        a = num / 100;  //100으로 나눈 몫 담음
        b = (num % 100) / 10;//나머지 연산자, 100으로 나눈 나머지에서(10의 자리 1의자리 나옴) 다시 10으로 나누어서 담음
        c = num % 10; //10으로 나눈 나머지를 담음

//        if(a > b) {
//            System.out.println(Math.max(a, c)); // 값 두개 넣어주면 둘 중에 큰값 찾음
//        } else {
//            System.out.println(Math.max(b, c));
//        }
        if(a > b) {
            if(a > c) System.out.println(a);
            else System.out.println(c);

        } else {
            if(b > c) System.out.println(b);
        else System.out.println(c);
        }
    }
}
