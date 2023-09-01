package 스택연습문제;

import java.util.Scanner;
import java.util.Stack;

//스택 이용해서 열린괄호 닫힘괄호 체크하기
public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>(); //문자형에대한 참조형 넣기, 참조변수로 바뀜
        Scanner sc = new Scanner(System.in);
        System.out.print("수식입력 : ");
        String exp = sc.next();
        //입력 받은 문자열 길이 만큼 반복문 순회
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                st.push(ch); // 열림괄호일때 push오토박싱. 내부가 참조타입이라 기본타입 넣을 수 없음. 박스로
            } else if (ch == ')') {
                if(!st.empty()) st.pop(); // 닫힘 괄호일때 pop
                else{
                    System.out.println("괄호가 일치하지 않음");
                    return;
                }
            }
        }
        if (st.isEmpty() ) { //비어있으면
            System.out.println("괄호가 일치함");
        } else {
            System.out.println("괄호가 일치하지 않음");
        }
    }
}
