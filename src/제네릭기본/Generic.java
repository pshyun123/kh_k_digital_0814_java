package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

//컴파일 시 강한 타입 체크
public class Generic {
    public static void main(String[] args) {
        //캐스팅하는 경우(이전 방식): 일단 집어넣고 빼낼때 형변환 함. 뺄 때 런타임오류날 수 있음
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0);
        System.out.println(str);

        //제네릭 타입으로 변환: 스트링타입으로 입력해줘. 그럼 입력할때 바로 오류 확인가능
        List<String> list2 = new ArrayList<>();
        list2.add("java");
        String str2 = list2.get(0);//0번째 값을 넣고
        System.out.println(str2);

    }
}
