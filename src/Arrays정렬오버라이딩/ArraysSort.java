package Arrays정렬오버라이딩;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args) {
        // 길이순 정렬, 길이 같으면 사전순 정렬
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Arrays.sort(fruit, new Comparator<String>() {//자동의
            @Override
            public int compare(String o1, String o2) {
               if(o1.length() > o2.length()) return 1; //짧은게 앞으로
                else {
                    if(o1.length() == o2.length()) { //길이가 같으면 사전순 정렬
                        //사전순 정렬
                        // 비교대상의 객체가 작으면 음수반환
                        // 비교대상의 객체가 작으면 음수반환
                        // 비교대상의 객체가 같으면 0 반환

                        return o1.compareTo(o2);
                    }
                        return -1; //현상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit)); //toString이 오버라이딩 되어있음
    }
}
