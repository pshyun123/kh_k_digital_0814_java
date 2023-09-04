package 스트링예제2;
// 반복자 스트림 forEach() : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당 함.
// 스트링을 이용해서 모두가 편차없는 공통적인 코드를 만들 수 있다.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class StringEx2 {
    public static void main(String[] args) {
//        //1. 기존 향상된 for문 (추천!)
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백이진"));
//        for(String e : list) System.out.println(e + " "); //기존 향상된 for문
//
//        //2. Iterator
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String name = iterator.next();
//            System.out.println(name + " ");
//
//        //3. steam-
//            list.forEach(e -> System.out.print(e + " "));
//        }

        List<Student> list = Arrays.asList(
                new Student("고유림", 67 ),
                new Student("나희도", 55 ),
                new Student("우영우", 99 ),
                new Student("최수연", 96 ),
                new Student("권민우", 92 )
        );
        //5. 스트림
        double average = list.stream() // 스트림 생성
                .mapToInt(Student::getScore) // 메소드 참조, 중간 연산
        // 10개 입력-> 가공-> 10개 출력 /e -> e.getScore() == Student::getScore
                .average() // 중간 연산
                .getAsDouble(); // 최종 연산
        System.out.println("평균 점수 : " + average);

        //6. 1~100까지 구성된 정수 스트림 생성
        IntStream stream = IntStream.rangeClosed(1,100);
        System.out.println("합계 : " + stream.sum());


        //4-2. 스트림 사용
//        list.forEach(s-> {
//            String name = s.getName();
//            int score = s.getScore();
//                    System.out.println(name + ":" + name);
//                });

//      //4-3. 향상된 for문
//        for(Student s : list ) {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + ":" + name);
//
        //4-4. 내부 반복자를 이용한 병렬처리
//            list.parallelStream().forEach(s -> {
//                String name = s.getName();
//                int score = s.getScore();
//                System.out.println(name + ":" + name);
//            });
        }
    }

//4. class 만들어서 불러오기
class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}