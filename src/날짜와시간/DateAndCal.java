package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Date() : 운영체제로부터 날짜와 시간정보를 가져와 원하는 포맨 형태로 출력, 객체를 생성해야함
public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        // 날짜를 원하는 포맷으로 변경
//        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//        System.out.println(sdf.format(now));
        // yyyy : 년도를 4자리로 표현
        // yy : 년도를 2자리로 표현
        // MM : 월을 표시 (반드시 대문자만 사용)
        // HH : 24시간제 표시
        // hh : 12시간제 표시
        // mm : 분을 표시 한다는 의미

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));
        Calendar cal = Calendar.getInstance();  // 운영체제로부터 시간을 가져옴
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // 배열의 인덱스와 같다. +1해준다(그냥 외우자) 0~11까지 인덱스가 있고 각나라마다 표기 방법 다름
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.AM_PM)); //오전 0, 오후1
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));



//캘린더연습 yyyy년MM월dd일 HH시mm분ss초//  사실 date 쓰는게 낫다

    Calendar date = Calendar.getInstance();
    int year = date.get(Calendar.YEAR);
    int mon = date.get(Calendar.MONTH)+1;
    int day = date.get(Calendar.DAY_OF_MONTH);
    int isPM = date.get(Calendar.AM_PM);
    int hour = date.get(Calendar.HOUR);
    int min = date.get(Calendar.MINUTE);
    int sec = date.get(Calendar.SECOND);
    if(isPM == 1) hour += 12; //오후면 시간에다가 12 더해준다.
    System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n",
            year, mon, day, hour, min, sec);
    //02 찍어주는 이유? -> 시 분 초 앞에 두자리 받겠다는 의미
        }
    }
}