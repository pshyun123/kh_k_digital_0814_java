package 스트림중개연산;
// 생성된 스트림은 중간연산을 통해 또 다른 스트림으로 변환됨.
// 1. 필터링 :
//  - filter() : 주어진 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
//  - distinct() : 중복된 요소가 제거된 새로운 스트림 생성

import java.util.stream.IntStream;

public class StreamEx4 {
    public static void main(String[] args) {

        IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,4,5,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,4,5,6);


        // 스트림 중복요소 제거
        stream1.distinct().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
        stream1.filter(e -> e % 2 !=0).forEach(e-> System.out.println(e + " "));
    }
}
