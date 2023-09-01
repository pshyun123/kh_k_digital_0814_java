package 전자레인지예제;
//몫과 나머지의 활용으로 문제를 해결하자.
//A: 5분(300초) 버튼 B: 1분(60초) 버튼 C: 10초 버튼
//최소횟수를 눌러 요리시간 설정
//시간 맞출 수 없으면 -1 반환

import java.util.Scanner;

public class MicrowaveEx {
    public static void main(String[] args) {
        int t,a,b,c;//요리시간을 초로 입력, a = 5분, b = 1분, c = 10초
        Scanner sc = new Scanner(System.in);
        System.out.println("요리시간(초) 입력 : ");
        t = sc.nextInt(); //시간
        //예외사항 먼저 처리
        if(t % 10 !=0) {
            System.out.println("-1");
            return;
        }
        // 10으로 나눈수가 0이 아니면...10초미만의 수가 있음

            a = t / 300; //5분 버튼에 대한 몫(5분 버튼이 눌려진 수)
            b = t % 300 / 60; //1분버튼이 눌려진 수
            c = t % 300 % 60 /10; //10초 버튼이 눌려진 수
            System.out.printf("%d %d %d\n", a, b, c);
        }
    }

