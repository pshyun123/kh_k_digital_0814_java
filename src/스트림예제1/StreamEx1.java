package 스트림예제1;
// 2시 40분 이전
// 다시 설명 듣기
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 스트림: 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것.
// 자료의 대상에 상관없이 동일한 연산 수행
// 내부반복자 사용 (반복문 배제하기 위함_for, 향상된 for)
// 원본데이터 변경 X
// 지연 연산과 병렬 처리 지원 (성능 향상을 위한 방법)
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림을 생성, 중간연산(가공), 최종 연산
//        list.stream().filter(s ->s.intValue() >= 5)  // int s 만들지 않았는데 알아서 지정
//        list.stream().filter(s ->s % 2 == 0 ).forEach(e -> System.out.println(e + " ")); // 짝수
        // list.stream() : 스트림 생성(1회용, 생성 후 소멸)
        //1~10. e는 도출한 짝수 값만 찍어
        int sumVal = list.stream().mapToInt(e -> e).sum(); // int값으로 1~10을 구하기 //mapToInt(e, int 스트림으로 변환)
        //sum()은 최종 연산이라 끝남
        int count = list.size();
        System.out.println("함계 : " + sumVal);
        System.out.println("횟수 : " + count);
    }
}
