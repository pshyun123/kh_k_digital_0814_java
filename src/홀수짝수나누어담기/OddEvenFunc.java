package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFunc {
    //input 배열만들기
//    int[] input = new int[7]; // 입력 7개 제한됨
//    int[] even = new int[7];
//    int[] odd = new int[7];
   List<Integer> input = new ArrayList<>();
   List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();


    //7개의 정수를 입력 받아서 배열에 넣기
    public void inputFunc() {
        System.out.println("입력:");
        Scanner sc = new Scanner(System.in); //
        for(int i = 0; i <7; i++) {
            input.add(sc.nextInt());

        }
    }
    public void oddEvenCalc(){
        for(Integer e : input) {
            if(e % 2 == 0 ) even.add(e); //e값을 2로 나눈 나머지가 0, 이 값을 even에 넣음
            else odd.add(e);
        }

    }
    public void oddEvenOutput() {
        System.out.print("홀수 : ");
        for(Integer e : odd) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even) System.out.print(e + " ");
    }
}