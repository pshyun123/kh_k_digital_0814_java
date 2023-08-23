package KMP;
// Knuth-Morris-Prett => KMP
// Mirko-Slavko => MS
// 1) split("-")을 이용해 문자열을 자르고, 자른 문자열의 0번째 인덱스를 선택하는 방법
// 2) 0번째 문자 출력, "-"다음의 첫번째 문자 선택하는 방법
// 3) 대문자만 골라냄 : charAt(인덱스), toCharArray() 사용

import java.util.Scanner;

public class KMPEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.next();

        // 1) split 사용
        String[] splitName = name.split("-");//하이픈 기준으로 길이지정//regex는 regular expression의 약자
        for (String e : splitName) {
            System.out.print(e.charAt(0));
        }//중괄호 꼭 잘 넣자, e첫번째 것


        // 2) 0번째 문자 출력, "-"다음의 첫번째 문자 선택
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) System.out.print(name.charAt(i));
            else {
                if (name.charAt(i) == '-') System.out.print(name.charAt(i + 1));
                //하이픈 다음에 문자 선책
            }
        }
        // 3) 대문자만 골라내기_ CharAt()
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                System.out.print(name.charAt(i));
            }
        }

        // 4) 문자열을 문자배열로 변경_ toCharArray()
        char[] chName = name.toCharArray();//문자열을 문자배열로 변환
            for (char ch : chName) {
                if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
            }
        }
    }




