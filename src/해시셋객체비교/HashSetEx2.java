package 해시셋객체비교;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        Member member4 = new Member(1003, "카리나");
        // 중복이 아닌걸로 인식함. 왜? 인스턴스 주소가 달라서 hashCode가 다름
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);//이때 파악함
        //hashSet.add(new Member(1003,"카리나")); // new로 추가해버리면 주소값이 달라서 그냥 +1 됨. 중복체크 X
//        for(Member e : hashSet) e.showMember();//equals 조건이 성립하는지 아닌지 // 중복체크하려면 오버라이딩해서 id값으로 잡아야함
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        s1.addAll(s2);      // 합집합: 양쪽 모두에 있는 것, 중복 제거
//        s1.retainAll(s2);   // 교집합 : 양쪽 모두 존재하는 항목
//        s1. removeAll(s2);  // 차집합 : 앞에서 뒤를 빼는 것
        System.out.println(s1);
    }
}
//정상적으로 아이디값으로 중복 제거 하고 싶으면
    class Member{
    int id; // 회원ID, 식별
    String name;
    @Override
    public int hashCode(){         //객체의 인스턴스 주소로 hashcode 구하지만, 지금 인스턴스 주소로 구별 X,id 값으로 구하도록 한것
        return id;                 // 중복 잡을 수 있게 id 값으로 변환
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) { //다운캐스팅이 성립하는지 확인하기 위한 조건,
            Member member = (Member) obj; //원해 형으로 형변환
            if (this.id == member.id) return true; // id가 같으면 중복이라고 판별
            else return false;
        }
        return false;
    }
//생성자 자동
        public Member(int id, String name) {
            this.id = id;
            this.name = name;
        }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}