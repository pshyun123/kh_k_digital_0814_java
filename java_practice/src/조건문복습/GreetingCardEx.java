package 조건문복습;

import java.util.Scanner;

//초대카드
public class GreetingCardEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("날짜 : ");
        String date = sc.nextLine();
        System.out.print("시간 : ");
        String time = sc.nextLine();

        String month = date.substring(4,6); //20230820
        String greeting = ""; //문자 초기화 -해야하는 이유?
        switch (month) {
            case "01":
                greeting = "한파의 연속인 1월입니다.";
                break;
            case "02":
                greeting = "한파의 연속인 2월입니다.";
                break;
            case "03":
                greeting = "3월입니다.";
                break;
            case "04":
                greeting = "4월입니다.";
                break;
            case "05":
                greeting = "5월입니다.";
                break;
            case "06":
                greeting = "6월입니다.";
                break;
            case "07":
                greeting = "7월입니다.";
                break;
            case "08":
                greeting = "8월입니다.";
                break;
            case "09":
                greeting = "9월입니다.";
                break;
            case "10":
                greeting = "10월입니다.";
                break;
            case "11":
                greeting = "11월입니다.";
                break;
            case "12":
                greeting = "12월입니다.";
                break;
            default:
                System.out.println("알 수 없는 월입니다.");
        }
        System.out.println(name + "님.");
        System.out.println(greeting);
        System.out.println("아래와 같은 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내주시기 바랍니다.\n");
        System.out.println("=".repeat(5) + "행사안내" + "=".repeat(5));
        System.out.println("날짜 : " + date.substring(0, 4) + "년" + month + "월" + date.substring(6,8) + "월");
        System.out.println("시간 : " + time + "분");


//00






}


        }

