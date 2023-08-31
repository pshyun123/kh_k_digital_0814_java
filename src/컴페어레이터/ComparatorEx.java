package 컴페어레이터;

import java.util.TreeSet;

//두개의 메소드를 비교하는 방법
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruits> set = new TreeSet<>(new DescendingComparator().reversed());
        set.add(new Fruits("포도", 3000));
        set.add(new Fruits("수박", 10000));
        set.add(new Fruits("딸기", 6000));
        for(Fruits e : set){
            System.out.println("과일 이름 : " + e.name + ", 가격 : " + e.price);
        }

    }

}
