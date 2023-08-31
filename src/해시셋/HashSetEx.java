package 해시셋;

import java.util.Arrays;
import java.util.HashSet;

//1) 중복허용하지 않음
//
//2) 순서 보장하지 않음
//
//3) 수학의 집합과 유사한 개념
public class HashSetEx {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
//        System.out.println(set);=====1번
//        String[]arr =("H", "e", "l" , "l", "o");
//        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
//        System.out.println(set);======2번


        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("J");
        set.add("a");
        set.add("v");
        set.add("e"); //add 안됨
        for(String e : set) System.out.println(e + " ");

    }
}
