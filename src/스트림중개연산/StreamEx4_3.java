package 스트림중개연산;

import java.util.stream.IntStream;

// 3. 제한
//  - limit() ; 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림 생성
//  - skip() ; 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림 생성
public class StreamEx4_3 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(0, 10);
//        stream1.forEach(System.out::print); //0123456789
        IntStream stream2 = IntStream.range(0, 10);
        IntStream stream3 = IntStream.range(0, 10);

        //전달된 요소의 개수만 제외, 0 ~ 3 제외됨
        stream1.skip(4).forEach(e -> System.out.print(e + " ")); //4 5 6 7 8 9
        System.out.println();

        //첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림 반환
        stream2.limit(5).forEach(e -> System.out.print(e + " ")); // 5 6 7 8 9
        System.out.println();
        //
        stream3.skip(3).limit(5).forEach(e -> System.out.print(e + " ")); //
        System.out.println();



    }
}
