package 스트림중개연산;

import java.util.Comparator;
import java.util.stream.Stream;

//정렬 :
// -sorted() :
public class StreamEx4_4 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        stream1.sorted().forEach((s -> System.out.println(s + " ")));
        System.out.println();
        stream2.sorted(Comparator.reverseOrder()).forEach((s -> System.out.println(s + " "))); //내림차순 정렬. 기존 정렬 뒤집기



    }
}
