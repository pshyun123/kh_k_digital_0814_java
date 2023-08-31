package 단어정렬하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

//알파벳 소문자로 이루어진 N개의 단어가 들어오면
//1. 길이가 짧은 것부터
//2. 길이가 같으면 사전 순으로 정렬
public class WordSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n의 개수 입력받기
        String[] word = new String[n]; //n개의 문자열 배열 생성
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.next();
        }
        //입력받은 문자열 배열의 중복제거를 위해 set 컬렉션에 넣음
        HashSet<String> set = new HashSet<>(Arrays.asList(word));
        //다시 원래 배열로 되돌림, 원래 생성된 크기만큼 되돌림(넣었다 빼기)
        word = set.toArray(new String[0]);
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { //길이비교, 같은 것 부터 사전순 정렬
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length(); //만약 앞이 길면 양수
                }
            }
        });
        System.out.println(Arrays.toString(word)); //향상된 포문 말고 tostring 도 가능
    }
}

