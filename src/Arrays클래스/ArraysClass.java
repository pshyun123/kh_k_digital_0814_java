package Arrays클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Arrays클래스는 배열을 다루기 위한 다양한 메소드 포함됨
public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 5, 8, 9, 2, 1};//배열의 값 입력 arr는 8개 잡힘, new 넣을 필요 없음. 컴파일러가 안다.
        //이중포문 대신
        //Arrays.sort(arr);
//        Arrays.sort(arr, Collections.reverseOrder()); //컬렉션 타입은 int 기본형 받지 않음. 왜?? 그래서 윗줄 Intger로 바꿈
//        for(int e : arr) System.out.print(e + " "); //e에 배열을 입력, e값을 찍고 공백입력
        //정렬 오버라이딩 : 재정의
        Arrays.sort(arr, new Comparator<Integer>() {//정렬은 내가 하는 게 아님. 자바가 알아서.
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;  //오름차순
                if (o1 < o2) return 1;  //내림차순
                //오름차순 앞에 게 크면 리턴1(숫서바꿔달라) 1은 순서 바꿔라 정렬은 자바가
                // 우리는 두개값중 크면 정렬해줘 0은 그대로
                return 0;

            }
        });
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
//퀵소트 알고리즘 돌았음
