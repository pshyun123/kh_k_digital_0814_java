package 스위치문;
// 조건에 조건식이 올 수 없고, 조건의 값이 와야 함.
// 조건 값에는 정수, 문자, 문자열이 올 수 있음.(실수는 x)
// 장점은 if 문에 비해서 가독성이 좋다.

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();
                switch (season) {
                    case "spring" :
                        System.out.println("꽃피는 봄이 왔어요.");
                        break;
                    case "summer" :
                        System.out.println("무더운 여름입니다.");
                        break;
                    case "fall" :
                    case " autumn":
                        System.out.println("천고마비의 가을입니다.");
                        break;
                    case "winter":
                        System.out.println("아직 겨울이네요ㅠㅠ.");
                        break;
                    default:
                        System.out.println("계절을 잘 못 입력했습니다.");
                }

        }
    }

