package 연습문제0818;
//알람 설정하기

import java.util.Scanner;

public class alarmEx {
    public static void main(String[] args) {
        // 입력받을 시간, 분을 입력받기위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 시간, 분을 각각 입력받음
        System.out.println("시간과 분을 입력하세요. : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 45분을 빼야함. 시간과 분을 총 몇분인지 환산, 거기서 45를 빼줌
        int totalMin = hour * 60 + min;
        // 계산된 시간이 45분 보다 작으면 하루전날이므로 하루의 시간만큼 더해줌
        if (totalMin < 45){
            totalMin = (24 * 60) + min; //24시간 넘어가버림
        }
        // 계산된 시간에서 45를 빼줌
        totalMin-= 45; //totalMin에서 -45분
        // 결과를 시간과 분으로 환산해서 출력
        System.out.println( (totalMin / 60) + "시 " + (totalMin % 60) + "분"); //60으로 나눈 나머지가 분






    }
}
