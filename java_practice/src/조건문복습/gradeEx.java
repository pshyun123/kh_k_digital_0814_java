package 조건문복습;
//성적 조건문
//90~100점은 A, 80~89점은 B, 70~79점은 C, 60~69점 D, 나머지 F 출력
//0~100 사이가 아니면 성적이 잘 못 입력되었다고 출력
//<선택> 성적이 잘 못 입력된 경우 재 입력 요구

import java.util.Scanner;

public class gradeEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int a = sc.nextInt(); //입력받아서 정수형 변수에 대입
        if (a >= 0 && a <= 100) ;

        if (a >= 0 && a <= 100) {
            if (a >= 90) System.out.println("A");
            else if (a >= 80) System.out.println("B");
            else if (a >= 70) System.out.println("C");
            else if (a >= 60) System.out.println("D");
            else System.out.println("F");
        } else System.out.println("잘 못 입력하셨습니다.");
        //00
    }
}
