package 컴페어레이터;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruits> {


    @Override
    public Comparator<Fruits> reversed(){//리버스는 정렬 반대로
        return Comparator.super.reversed();
    }
    @Override
    public int compare(Fruits o1, Fruits o2) {//매개변수가 두개들어옴
        //비교조건만 넣는다. 내림차순으로 정렬됨
        if(o1.price < o2.price) return 1;
        else if(o1.price == o2.price) return 0;
        else return -1;
    }

}
