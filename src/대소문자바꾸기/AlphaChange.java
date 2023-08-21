package 대소문자바꾸기;

import java.util.Scanner;

//영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
// charAt(index) : 문자열에 해당 인덱스 문자를 추출
// toCharArray() : 문자열을 문자배열로 변환
public class AlphaChange {
    public static void main(String[] args) {
//
//        //스캐너 생성
//        Scanner sc = new Scanner(System.in);
//        //문자열 입력받음
//        System.out.print("문자열 입력 : ");
//        String input = sc.nextLine();
//        char[] word;
//        word = input.toCharArray();
//
//        //문자열 길이만큼 순회 하면서 문자에 대한 아스키코드 값 확인,
//        // 대문자인지 소문자인지 확인 후 계산
//        for(int i = 0; i < word.length; i++) {
//            if(word[i] <'a') word[i] = (char)(word[i] + ('a' - 'A'));
//                else word[i] = (char)(word[i] - ('a' - 'A'));
//        }
//        System.out.println(word);
                Scanner sc = new Scanner(System.in);
                System.out.print("문자열 입력 : ");
                String input = sc.next();
                for(int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (ch < 'a') System.out.print((char)(ch + ('a' - 'A'))); //a 보다 작으니까??                    else System.out.print((char)(ch - ('a' - 'A')));
                }
            }
        }


