package List인터페이스;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//리스트 인터페이스는 ArrayList, Linked List, Vector의 부모로 인터페이스로 구현되어 있음
//리스트 구조는 배열과 유사, 차이점: 동적으로 크기 변함
//ArrayList, Linked List, Vector 거의 동일한 메소드. 코드 변환이 자유로움
//ArrayList: 대표적 자료구조( 특별한 경우가 아니면 ArrayList 사용
//검색이 빈번한 경우 효율적이며, 맨 뒤에 입력이 일어나는 경우에는 효과적임
public class ListEx1 {
    public static void main(String[] args) {
        String[] arr = {"1000","2000","3000"};
        // Arrays.asList(arr) : 이미 만들어진 배열을 ArrayList에 추가
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        // List에 값을 추가 : add()
        System.out.println(list);
        // 특정 위치 값 가져올 때 : get (index)
        System.out.println(list.get(0));
        // List의 크기를 가져올때 : size()
        System.out.println(list.size());
        // List 내에 해당하는 항목이 있는지 판별: contains("값")
        System.out.println(list.contains("142")); //false
        System.out.println("포함여부 확인: " + list.contains("142")); //false
        // remove(객체) : List에서 객체에 해당하는 항목을 삭제하고 그 결과를 반환
        // remove(인덱스) : 해당 인덱스 값 삭제하고 삭제된 값 반환
        System.out.println("삭제성공여부: " + list.remove(2));

        Comparator<String> nameComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;//정렬조건
            }
        };

        list.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(list);





    }

}
