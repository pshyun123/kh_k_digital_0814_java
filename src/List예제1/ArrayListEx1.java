package List예제1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //객체 타입 넣기
        //List 인터페이스의 참조변수로 ArrayList 객체를 참조 함
        List<MenuInfo> menuInfoList = new ArrayList<>();
        //add 는 객체를 추가, 추가할 때마다 크기가 변함
        MenuInfo menuInfo1 = new MenuInfo("우유", 2000, "커피", true);
        menuInfoList.add(menuInfo1); // [방법1] 이전 방법 활용,참조변수로 그걸 넣음. 아래와 결과 값 같다.

        menuInfoList.add(new MenuInfo("아메리카노", 2500, "커피", true));
        menuInfoList.add(new MenuInfo("라떼", 4000, "커피", true));
        menuInfoList.add(new MenuInfo("홍차", 5000, "티", true));
        //[방법2] 객체를 만들면서 바로 활용. 내부에서 받아주는 변수 있음

        //향상된 for문 : 배열 또는 Collection 클래스의 자식들에서 사용 가능, get인덱스 필요 없음
        for(MenuInfo menu : menuInfoList) {
            System.out.println(menu.getMenuInfo());
        }
        for(int i = 0; i <menuInfoList.size(); i++) {
            System.out.println(menuInfoList.get(i).getMenuInfo());
        }

    }
}
class MenuInfo {
    String name;
    int price;
    String category;

    boolean isTax;

    //생성자 자동입력
    public MenuInfo(String name, int price, String category,  boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;

        this.isTax = isTax;
    }
    public String getMenuInfo() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
