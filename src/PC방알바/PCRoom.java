package PC방알바;
//인원 수
//예약할 좌석 번호 100개
//결과는 거절 횟수 출력

import java.util.Scanner;

public class PCRoom {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];//100보다 작거나 같음, 최대수용인원 100명
        int cnt = 0, seatNum;// 거절횟수카운트
        Scanner sc = new Scanner(System.in); //새로 스캐너 입력
        int num = sc.nextInt(); // 인원수를 입력 받음
        for(int i = 0; i < num; i++) { //i가 n보다 작을때 i는 1씩 증가한다.
            seatNum = sc.nextInt();//좌석의 수입력하고 공백,엔터 발생하면 내려감
            if(pcRoom[seatNum-1] == 1) cnt++; //(좌석의 수 -1)하면 실제 인덱스. 1번호출하면 1이었다면 이미 있기 때문에  거절횟수 +해줌
            else pcRoom[seatNum-1] = 1; //아닐경우 이자리를 1로

        }
        System.out.println(cnt);
    }
}
