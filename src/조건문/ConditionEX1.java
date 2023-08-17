package 조건문;

import java.util.Scanner;

// 조건문은 조건을 만족하는 경우와 만족하지 않는 경우로 나누어 수행하는 것.
public class ConditionEX1 {
    public static void main(String[] args) {

        //if ~ else : 참인 경우, 거짓인 경우를 나누어 수행

//        System.out.print("정수를 입력하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if(num > 100) {
//            System.out.println(num + "은 100보다 크다.");
//        }  else if(num <100) {
//                System.out.println(num + "은 100보다 작다.");
//            } else {
//            System.out.println(num + "은 100과 같다");
//        }
       System.out.print("문자를 입력하시오 : ");
       Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);
       if(ch >= 'a' && ch <= 'z') {  //
           System.out.println(ch + "는 알파벳 소문자입니다.");
       } else if(ch >= 'A' && ch<='Z') {
           System.out.println(ch + "는 알파벳 대문자입니다.");
       } else {
               System.out.println(ch + "는 알파벳이 아닙니다.");
           }
       }



        }




