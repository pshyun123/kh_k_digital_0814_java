package 열거타입;
//서로 연관된 상수들을 모아 놓은 것
//실제 값 뿐만 아니라 타입까지 체크 가능
//예전에 class 내에서 final static String… 정의해서 사용하던 방식 대체 할 수 있음

import java.util.Calendar;

public class EnumType {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance(); //캘린더는 클래스로 접근해야함, 날짜정보 가져오고
        int week = cal.get(Calendar.DAY_OF_WEEK);//주에서 몇번째 요일인지
        switch (week){
            case 1 :    //주에서 첫번째 날은
                today = Week.SUNDAY; break;//week라는 열거타입. 여기 올 수 있는건 아래 지정해준 값만 월~일
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY;break;
            case 4 :
                today = Week.WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘 요일 : " + today);
    }

//왜 밖에다가 하는거지?
enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
}
