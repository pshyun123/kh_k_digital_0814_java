package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

//요소의 소모 : 언제 사용하는거지??
public class StreamEx5 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        //넷++둘 만든다음 소모, (넷++둘)이게 s1이 되고 ++셋, 같은방식으로 ++하나
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
        Optional<String> rst1 = stream1.reduce((s1,s2)->s1 + "++" + s2);
        //Optional<String> rst1 : null 방지하기 위한 문법
        rst1.ifPresent(e-> System.out.println(e + " ")); //null 안 일어났으면 출력해라
        System.out.println();

        //Optional<String> rst1 안쓰고
        String rst2 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
        System.out.println(rst2);
    }
}
