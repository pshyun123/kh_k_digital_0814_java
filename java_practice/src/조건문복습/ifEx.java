package 조건문복습;

import java.util.Scanner;

public class ifEx {
    public static void main(String[] args) {
//        System.out.print("정수를 입력하세요 : ");
        System.out.print("문자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        if(num >= 0) {
//            System.out.println(num + "은 양수입니다.");
//        } else {
//            System.out.println(num + "은 음수입니다.");
//        }

//      if(num > 100) {
//          System.out.println(num + "은 100보다 크다.");
//      } else if(num < 100) {
//          System.out.println(num + "은 100보다 작다.");
//      } else {
//          System.out.println(num + "은 100과 같다.");
//          }
//

        char ch = sc.next().charAt(0); //띄어쓰기 혹은 엔터키 입력이 있을 경우 0번째에 있는 것을 입력
        if(ch >= 'a' && ch <= 'z') {  //
            System.out.println(ch + "는 알파벳 소문자 입니다.");
        } else if(ch >= 'A' && ch <='Z') {
            System.out.println(ch + "는 알파벳 대문자입니다.");
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");

        }
      }

    }

