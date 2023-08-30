package 홀수짝수나누어담기;
// 7개의 정수를 입력 받는 메서드 만들기(정수니까 0이 들어올 수 있음)
// 홀수,짝수 배열로 나누어 담는 메소드 만들기
// 홀수,짝수 출력하는 함수 만들기
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
// 클래스 생성해서 만들기//메인에다가 메소드 만들지 말기

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//그걸 어레이 리스트에 담기
public class OddEvenArray {
    public static void main(String[] args) {
//       OddEvenFunc oddEvenFunc = new OddEvenFunc();
//       oddEvenFunc.inputFunc();
//       oddEvenFunc.oddEvenCalc();
//       oddEvenFunc.oddEvenOutput();
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("정수 입력 : ");
        for (int i = 0; i < 7; i++) list.add(sc.nextInt());
            //===여기까진 같음===
        System.out.print("홀수 : ");
        list.stream().filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n->n % 2 == 0).forEach(e->System.out.print(e + " "));




    }
}
