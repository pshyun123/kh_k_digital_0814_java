package 스트림중개연산;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//2. 스트림 변환 : 해당 스트림을
//  - map() : 해당스트림의 요소들을 함수에 인수로 전달, 그 반환값으로 이루어진 새로운 스트림 만듦 (10을 넣으면 10을 반환함) 95%
//  - flatMap() : 스트림 평면화. 각 요소를 변환하여 중복된 스트림을 1차원으로 평면화하여 새로운 스트림을 생성.
public class StreamEx4_2 {
    public static void main(String[] args) {

        IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,4,5,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,4,5,6);

        Stream<String> stream = Stream.of("HTML","CSS","JAVA", "JAVASCRIPT");
        stream.map(String::length).forEach(e -> System.out.print(e + " ")); // 여러개의 값 형변환 e -> e.length() == String::length
        System.out.println();

//        Stream <String> stream4 = Stream.of("I study hard", "You study JAVA", "I am hungry");
//        stream4.flatMap(e-> Stream.of(e.split(" +"))).forEach(System.out::println);

    }
}
