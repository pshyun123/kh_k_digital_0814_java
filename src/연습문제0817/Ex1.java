package 연습문제0817;
//성적조건문
import java.util.Scanner;
// 시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B,
// 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
// 0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
// [선택사항] 성적이 잘못 입력된 경우 재입력 요구
public class Ex1 {
    public static void main(String[] args) {

        //입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        //입력을 받아서 정수형 변수에 대입
        int a = sc.nextInt();
        //조건문 만드는데 우선 0 ~ 100 사이의 정상적인 입력인지 확인
        if (a >= 0 && a <= 100) {
            //정상적인 입력이었다면 각각의 성적구간에 따라 출력

            if (a >= 0 && a <= 100) {
                if (a >= 90) System.out.println("A");
                else if (a >= 80) System.out.println("B");
                else if (a >= 70) System.out.println("C");
                else if (a >= 60) System.out.println("D");
                else System.out.println("F");
            } else
                System.out.println("잘 못 입력하셨습니다.");
        }
    }
    }
